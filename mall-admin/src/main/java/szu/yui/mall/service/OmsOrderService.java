package szu.yui.mall.service;

import org.springframework.transaction.annotation.Transactional;
import szu.yui.mall.dto.*;
import szu.yui.mall.model.OmsOrder;

import java.util.List;

public interface OmsOrderService {
    /**
     * 订单查询
     * @param queryParam
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<OmsOrder> list(OmsOrderQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量发货
     * @param deliveryParamList
     * @return
     */
    @Transactional
    int delivery(List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 批量关闭订单
     * @param ids
     * @param node
     * @return
     */
    @Transactional
    int close(List<Long> ids, String node);

    /**
     * 批量删除订单
     * @param ids
     * @return
     */
    int delete(List<Long> ids);

    /**
     * 获取指定订单详情
     * @param id
     * @return
     */
    OmsOrderDetail detail(Long id);

    /**
     * 修改订单收货人信息
     * @param receiverInfoParam
     * @return
     */
    @Transactional
    int updateReceiverInfo(OmsReceiverInfoParam receiverInfoParam);

    /**
     * 修改订单费用信息
     * @param moneyInfoParam
     * @return
     */
    @Transactional
    int updateMoneyInfo(OmsMoneyInfoParam moneyInfoParam);

    /**
     * 修改备注信息
     * @param id
     * @param note
     * @param status
     * @return
     */
    @Transactional
    int updateNote(Long id, String note, Integer status);
}
