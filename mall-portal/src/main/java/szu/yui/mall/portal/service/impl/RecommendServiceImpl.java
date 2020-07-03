package szu.yui.mall.portal.service.impl;

import cn.hutool.core.lang.Assert;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import szu.yui.mall.mapper.OmsOrderMapper;
import szu.yui.mall.model.OmsOrder;
import szu.yui.mall.model.UmsMember;
import szu.yui.mall.portal.domain.*;
import szu.yui.mall.portal.repository.*;
import szu.yui.mall.portal.service.RecommendService;
import szu.yui.mall.portal.service.UmsMemberService;

import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
@Service
public class RecommendServiceImpl implements RecommendService {
    @Autowired
    private CFItemRecsRepository cfItemRecsRepository;
    @Autowired
    private ContentBasedRecsRepository contentBasedRecsRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductCommentCountRepository productCommentCountRepository;
    @Autowired
    private RatingRepository ratingRepository;
    @Autowired
    private UserRecListRepository userRecListRepository;
    @Autowired
    private UmsMemberService memberService;
    @Autowired
    private RatingSourceRepository ratingSourceRepository;
    @Autowired
    private OmsOrderMapper omsOrderMapper;
    @Autowired
    private UserRecsRepository userRecsRepository;
    @Override
    public ArrayList<Product> getCFItemRecList(Integer memberId) {
        ArrayList<Rating> like_items_rate = ratingRepository.findByUserId(memberId);
        ArrayList<Integer> product_like = new ArrayList<>();
        for(Rating rate : like_items_rate){
            product_like.add(rate.getProductId());
        }
        HashSet<PRate> set = new HashSet<>();
        for(Integer productId : product_like){
            ItemCFProductRecs itemCFProductRecs = cfItemRecsRepository.findByProductId(productId);
            set.addAll(itemCFProductRecs.getRecs());
        }
        ArrayList<PRate> res = new ArrayList<>(set);
        ArrayList<Product> products = new ArrayList<>();
        for(PRate item : res){
            Product product = productRepository.findProductByProductId(item.getProductId());
            products.add(product);
        }
        UserRecList userRecList = new UserRecList();
        userRecList.setMemberId(memberId);
        userRecList.setRecList(products);
        userRecListRepository.save(userRecList);
        return products;
    }

    @Override
    public List<Product> getCFItemRecListForPID(Integer productId) {
        ItemCFProductRecs itemCFProductRecs = cfItemRecsRepository.findByProductId(productId);
        ArrayList<PRate> PRateList = itemCFProductRecs.getRecs();
        ArrayList<Integer> productList = new ArrayList<>();
        for(PRate pRate : PRateList){
            productList.add(pRate.getProductId());
        }
        ArrayList<Product> res = productRepository.findByProductIdIn(productList);
        return res;
    }

    @Override
    public List<Product> getContentRecList(Integer productId) {
        ContentBasedProductRecs contentBasedProductRecs = contentBasedRecsRepository.findByProductId(productId);
        ArrayList<PRate> PRateList = contentBasedProductRecs.getRecs();
        ArrayList<Integer> productList = new ArrayList<>();
        for(PRate pRate : PRateList){
            productList.add(pRate.getProductId());
        }
        ArrayList<Product> res = productRepository.findByProductIdIn(productList);
        return res;
    }

    @Override
    public List<Product> getContentRecPage(List<Integer> ids, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        ArrayList<ContentBasedProductRecs> contentBasedProductRecs = contentBasedRecsRepository.findByProductIdIn(ids);
        HashSet<Integer> set = new HashSet<>();
        for(ContentBasedProductRecs rec : contentBasedProductRecs){
            ArrayList<PRate> pRates = rec.getRecs();
            for(PRate pRate : pRates){
                set.add(pRate.getProductId());
            }
        }
        ArrayList<Integer> intlist = new ArrayList<>(set);
        ArrayList<Product> res = productRepository.findByProductIdIn(intlist);
        return res;
    }

    @Override
    public List<Integer> getAll() {
        ArrayList<Product> productsList = (ArrayList<Product>) productRepository.findAll();
        ArrayList<Integer> res = new ArrayList<>();
        for(Product product : productsList){
            res.add(product.getProductId());
        }
        return res;
    }

    @Override
    public List<Product> getCommentMostList(){
        ArrayList<ProductComments> commentsList = (ArrayList<ProductComments>) productCommentCountRepository.findAll();
        ArrayList<Integer> ids = new ArrayList<>();
        for(int i = 0; i < 8; i++){
            ids.add(commentsList.get(i).getProductId());
        }
        ArrayList<Product> res = productRepository.findByProductIdIn(ids);
        return res;
    }

    @Override
    public List<Product> getNiceProductList() {
        Double line = new Double(4.7);
        ArrayList<Product> niceProductList = productRepository.findTop4ByAvgGreaterThanEqual(line);
        return niceProductList;
    }

    @Override
    public Product getProductDetail(Integer productId){
        Product product = productRepository.findProductByProductId(productId);
        return product;
    }

    @Override
    public List<Product> getRecListByMemberId(Integer memberId) {
        UserRecList res = userRecListRepository.findByMemberId(memberId);
        return res.getRecList();
    }

    @Override
    public Rating getRate(Integer productId, Integer score) {
        Rating rating = ratingRepository.findFirstByProductIdAndScoreEquals(productId, score);
        return rating;
    }

    @Override
    public Integer insertRating(RatingCreate ratingCreate) {
        UmsMember umsMember = memberService.getCurrentMember();
        Long time = System.currentTimeMillis();
        for(Integer pid : ratingCreate.getRatingWithGoods().keySet()){
            RatingSource ratingSource = new RatingSource();
            ratingSource.setUserId(umsMember.getId());
            ratingSource.setTimestamp(new Date());
            ratingSource.setProductId(pid);
            ratingSource.setScore(ratingCreate.getRatingWithGoods().get(pid));
            ratingSourceRepository.save(ratingSource);
        }
        OmsOrder omsOrder = new OmsOrder();
        omsOrder.setId(ratingCreate.getOrderId());
        omsOrder.setCommentTime(new Date());
        omsOrderMapper.updateByPrimaryKeySelective(omsOrder);
        return ratingCreate.getRatingWithGoods().keySet().size();
    }

    @Override
    public List<Product> getUserRecs() {
        UmsMember umsMember = memberService.getCurrentMember();
        Integer uid = umsMember.getId();
        UserRecs userRecs = userRecsRepository.findByUserId(uid);
        List<PRate> pRateList = userRecs.getRecs();
        List<Integer> integers = new ArrayList<>();
        for(PRate pRate : pRateList){
            integers.add(pRate.getProductId());
        }
        List<Product> products = productRepository.findByProductIdIn(integers);
        return products;
    }
}
