package szu.yui.mall.portal.service;

import org.springframework.transaction.annotation.Transactional;
import szu.yui.mall.common.api.CommonResult;
import szu.yui.mall.model.OmsCartItem;
import szu.yui.mall.model.OmsOrder;
import szu.yui.mall.model.OmsOrderItem;
import szu.yui.mall.portal.domain.ConfirmOrderResult;
import szu.yui.mall.portal.domain.OrderParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 前台订单管理Service
 */
public interface OmsPortalOrderService {
    /**
     * 根据用户购物车信息生成确认单信息
     */
    ConfirmOrderResult generateConfirmOrder(List<OmsCartItem> cartItemList);

    /**
     * 根据提交信息生成订单
     */
    @Transactional
    Map<String, Object> generateOrder(OrderParam orderParam);

    /**
     * 支付成功后的回调
     */
    @Transactional
    Integer paySuccess(Long orderId);

    /**
     * 自动取消超时订单
     */
    @Transactional
    Integer cancelTimeOutOrder();

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);

    /**
     * 发送延迟消息取消订单
     */
    void sendDelayMessageCancelOrder(Long orderId);

    /**
     * 获取某个用户的订单信息
     * @param
     * @return
     */
    List<OmsOrder> listOrderByMember();

    /**
     * 获取单号中的商品信息
     */
    HashMap<Long, List<OmsOrderItem>> listOrderItemByOrderId();
}
