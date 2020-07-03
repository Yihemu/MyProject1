package szu.yui.mall.portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import szu.yui.mall.portal.domain.MemberProductCollection;
import szu.yui.mall.portal.domain.MemberReadHistory;
import szu.yui.mall.portal.repository.MemberProductCollectionRepository;
import szu.yui.mall.portal.service.MemberCollectionService;
import szu.yui.mall.portal.util.DateUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 会员收藏Service实现类
 */
@Service
public class MemberCollectionServiceImpl implements MemberCollectionService {
    @Autowired
    private MemberProductCollectionRepository productCollectionRepository;

    @Override
    public int addProduct(MemberProductCollection productCollection) {
        int count = 0;
        MemberProductCollection findCollection = productCollectionRepository.findByMemberIdAndProductId(productCollection.getMemberId(), productCollection.getProductId());
        if (findCollection == null) {
            productCollection.setCreateTime(new Date());
            productCollectionRepository.save(productCollection);
            count = 1;
        }
        return count;
    }

    @Override
    public int deleteProduct(List<String> ids) {
        List<MemberProductCollection> deleteList = new ArrayList<>();
        for(String id:ids){
            MemberProductCollection memberProductCollection = new MemberProductCollection();
            memberProductCollection.setId(id);
            deleteList.add(memberProductCollection);
        }
        productCollectionRepository.deleteAll(deleteList);
        return ids.size();
    }

    @Override
    public List<MemberProductCollection> listProduct(Integer memberId) {
        return productCollectionRepository.findByMemberId(memberId);
    }
}
