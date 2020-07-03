package szu.yui.mall.portal.domain;

import szu.yui.mall.model.OmsCartItem;

import java.util.List;

/**
 * 生成订单时传入的参数
 */
public class OrderParam {
    //收货地址id
    private Long memberReceiveAddressId;
    //需要结算的商品
    private List<OmsCartItem> selectedItem;
    //优惠券id
//    private Long couponId;
    //使用的积分数
//    private Integer useIntegration;
    //支付方式
    private Integer payType;

    public List<OmsCartItem> getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(List<OmsCartItem> selectedItem) {
        this.selectedItem = selectedItem;
    }

    public Long getMemberReceiveAddressId() {
        return memberReceiveAddressId;
    }

    public void setMemberReceiveAddressId(Long memberReceiveAddressId) {
        this.memberReceiveAddressId = memberReceiveAddressId;
    }

//    public Long getCouponId() {
//        return couponId;
//    }
//
//    public void setCouponId(Long couponId) {
//        this.couponId = couponId;
//    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

//    public Integer getUseIntegration() {
//        return useIntegration;
//    }
//
//    public void setUseIntegration(Integer useIntegration) {
//        this.useIntegration = useIntegration;
//    }
}
