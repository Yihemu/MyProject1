package szu.yui.mall.portal.service;

import szu.yui.mall.portal.domain.Product;
import szu.yui.mall.portal.domain.Rating;
import szu.yui.mall.portal.domain.RatingCreate;

import java.util.List;

public interface RecommendService {
    List<Product> getCFItemRecList(Integer productId);
    List<Product> getCFItemRecListForPID(Integer productId);
    List<Product> getContentRecList(Integer productId);
    List<Product> getContentRecPage(List<Integer> ids, Integer pageSize, Integer pageNum);
    List<Integer> getAll();
    List<Product> getCommentMostList();
    List<Product> getNiceProductList();
    Product getProductDetail(Integer productId);
    List<Product> getRecListByMemberId(Integer memberId);
    Rating getRate(Integer productId, Integer score);
    Integer insertRating(RatingCreate ratingCreate);
    List<Product> getUserRecs();
}
