package szu.yui.mall.portal.domain;

import szu.yui.mall.model.OmsCartItem;
import szu.yui.mall.model.UmsIntegrationConsumeSetting;
import szu.yui.mall.model.UmsMemberReceiveAddress;
import szu.yui.mall.portal.domain.CartPromotionItem;

import java.math.BigDecimal;
import java.util.List;

/**
 * 确认单信息封装
 */
public class ConfirmOrderResult {
    //需要结算的商品列表
    private List<OmsCartItem> selectedCartItems;
    //包含优惠信息的购物车信息
//    private List<CartPromotionItem> cartPromotionItemList;
    //用户收货地址列表
    private List<UmsMemberReceiveAddress> memberReceiveAddressList;
    //用户可用优惠券列表
//    private List<SmsCouponHistoryDetail> couponHistoryDetailList;
    //积分使用规则
//    private UmsIntegrationConsumeSetting integrationConsumeSetting;
    //会员持有的积分
//    private Integer memberIntegration;
    //计算的金额
//    private CalcAmount calcAmount;
    //简单结算金额
    private BigDecimal easyAmount;

    public BigDecimal getEasyAmount() {
        return easyAmount;
    }

    public void setEasyAmount(BigDecimal easyAmount) {
        this.easyAmount = easyAmount;
    }

    public List<OmsCartItem> getSelectedCartItems() {
        return selectedCartItems;
    }

    public void setSelectedCartItems(List<OmsCartItem> selectedCartItems) {
        this.selectedCartItems = selectedCartItems;
    }

//    public List<CartPromotionItem> getCartPromotionItemList() {
//        return cartPromotionItemList;
//    }
//
//    public void setCartPromotionItemList(List<CartPromotionItem> cartPromotionItemList) {
//        this.cartPromotionItemList = cartPromotionItemList;
//    }

    public List<UmsMemberReceiveAddress> getMemberReceiveAddressList() {
        return memberReceiveAddressList;
    }

    public void setMemberReceiveAddressList(List<UmsMemberReceiveAddress> memberReceiveAddressList) {
        this.memberReceiveAddressList = memberReceiveAddressList;
    }

//    public List<SmsCouponHistoryDetail> getCouponHistoryDetailList() {
//        return couponHistoryDetailList;
//    }
//
//    public void setCouponHistoryDetailList(List<SmsCouponHistoryDetail> couponHistoryDetailList) {
//        this.couponHistoryDetailList = couponHistoryDetailList;
//    }
//
//    public UmsIntegrationConsumeSetting getIntegrationConsumeSetting() {
//        return integrationConsumeSetting;
//    }
//
//    public void setIntegrationConsumeSetting(UmsIntegrationConsumeSetting integrationConsumeSetting) {
//        this.integrationConsumeSetting = integrationConsumeSetting;
//    }

//    public Integer getMemberIntegration() {
//        return memberIntegration;
//    }
//
//    public void setMemberIntegration(Integer memberIntegration) {
//        this.memberIntegration = memberIntegration;
//    }
//
//    public CalcAmount getCalcAmount() {
//        return calcAmount;
//    }
//
//    public void setCalcAmount(CalcAmount calcAmount) {
//        this.calcAmount = calcAmount;
//    }

    public static class CalcAmount{
        //订单商品总金额
        private BigDecimal totalAmount;
        //运费
        private BigDecimal freightAmount;
        //活动优惠
        private BigDecimal promotionAmount;
        //应付金额
        private BigDecimal payAmount;

        public BigDecimal getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(BigDecimal totalAmount) {
            this.totalAmount = totalAmount;
        }

        public BigDecimal getFreightAmount() {
            return freightAmount;
        }

        public void setFreightAmount(BigDecimal freightAmount) {
            this.freightAmount = freightAmount;
        }

        public BigDecimal getPromotionAmount() {
            return promotionAmount;
        }

        public void setPromotionAmount(BigDecimal promotionAmount) {
            this.promotionAmount = promotionAmount;
        }

        public BigDecimal getPayAmount() {
            return payAmount;
        }

        public void setPayAmount(BigDecimal payAmount) {
            this.payAmount = payAmount;
        }
    }
}
