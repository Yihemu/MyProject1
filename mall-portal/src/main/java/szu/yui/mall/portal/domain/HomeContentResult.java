package szu.yui.mall.portal.domain;

import lombok.Getter;
import lombok.Setter;
import szu.yui.mall.model.CmsSubject;
import szu.yui.mall.model.PmsBrand;
import szu.yui.mall.model.PmsProduct;
import szu.yui.mall.model.SmsHomeAdvertise;

import java.util.List;

/**
 * 首页内容返回信息封装
 */
@Getter
@Setter
public class HomeContentResult {
    //轮播广告
    private List<SmsHomeAdvertise> advertiseList;
    //推荐品牌
    private List<PmsBrand> brandList;
    //当前秒杀场次
    //private HomeFlashPromotion homeFlashPromotion;
    //新品推荐
    private List<PmsProduct> newProductList;
    //人气推荐
    //private List<PmsProduct> hotProductList;
    //推荐专题
    //private List<CmsSubject> subjectList;
}
