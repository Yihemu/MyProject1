package szu.yui.mall.portal.service;

import szu.yui.mall.model.OmsCartItem;
import szu.yui.mall.portal.domain.CartProduct;
import szu.yui.mall.portal.domain.CartPromotionItem;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 购物车管理Service
 */
public interface OmsCartItemService {
    /**
     * 查询购物车中是否包含该商品，有增加数量，无添加到购物车
     */
    @Transactional
    int add(OmsCartItem cartItem);

    /**
     * 根据会员编号获取购物车列表
     */
    List<OmsCartItem> list(Integer memberId);

    /**
     * 获取包含促销活动信息的购物车列表
     */
    List<CartPromotionItem> listPromotion(Integer memberId);

    /**
     * 修改某个购物车商品的数量
     */
    int updateQuantity(Long id, Integer memberId, Integer quantity);

    /**
     * 批量删除购物车中的商品
     */
    int delete(Integer memberId,List<Long> ids);

    /**
     *获取购物车中用于选择商品规格的商品信息
     */
    CartProduct getCartProduct(Integer productId);

    /**
     * 修改购物车中商品的规格
     */
    @Transactional
    int updateAttr(OmsCartItem cartItem);

    /**
     * 清空购物车
     */
    int clear(Integer memberId);
}
