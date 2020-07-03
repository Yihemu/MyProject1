package szu.yui.mall.dto;

import lombok.Getter;
import lombok.Setter;
import szu.yui.mall.model.PmsProduct;
import szu.yui.mall.model.SmsFlashPromotionProductRelation;

/**
 * 限时购及商品信息封装
 */
public class SmsFlashPromotionProduct extends SmsFlashPromotionProductRelation {
    @Getter
    @Setter
    private PmsProduct product;
}
