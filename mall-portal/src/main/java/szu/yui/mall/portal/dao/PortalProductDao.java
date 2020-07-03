package szu.yui.mall.portal.dao;

import org.apache.ibatis.annotations.Param;
import szu.yui.mall.portal.domain.CartProduct;
import szu.yui.mall.portal.domain.PromotionProduct;

import java.util.List;

/**
 * 前台系统自定义商品Dao
 */
public interface PortalProductDao {
    CartProduct getCartProduct(@Param("id") Integer id);
    List<PromotionProduct> getPromotionProductList(@Param("ids") List<Integer> ids);
}
