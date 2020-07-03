package szu.yui.mall.portal.domain;

import lombok.Getter;
import lombok.Setter;
import szu.yui.mall.model.PmsProduct;

import java.math.BigDecimal;

/**
 * 秒杀信息和商品对象封装
 */
@Getter
@Setter
public class FlashPromotionProduct extends PmsProduct {
    //秒杀商品的价格
    private BigDecimal flashPromotionPrice;
    //秒杀商品的总数
    private Integer flashPromotionCount;
    //秒杀商品限购数量
    private Integer flashPromotionLimit;
}
