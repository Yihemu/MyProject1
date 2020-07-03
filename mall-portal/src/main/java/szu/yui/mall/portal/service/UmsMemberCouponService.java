package szu.yui.mall.portal.service;

import org.springframework.transaction.annotation.Transactional;
import szu.yui.mall.common.api.CommonResult;
import szu.yui.mall.model.SmsCouponHistory;
import szu.yui.mall.portal.domain.CartPromotionItem;
import szu.yui.mall.portal.domain.SmsCouponHistoryDetail;

import java.util.List;

/**
 * 用户优惠券管理Service
 */
public interface UmsMemberCouponService {
    /**
     * 会员添加优惠券
     */
    @Transactional
    void add(Long couponId);

    /**
     * 获取优惠券列表
     * @param useStatus 优惠券的使用状态
     */
    List<SmsCouponHistory> list(Integer useStatus);

    /**
     * 根据购物车信息获取可用优惠券
     */
    List<SmsCouponHistoryDetail> listCart(List<CartPromotionItem> cartItemList, Integer type);
}
