package szu.yui.mall.dao;

import org.apache.ibatis.annotations.Param;
import szu.yui.mall.dto.OmsOrderDeliveryParam;
import szu.yui.mall.dto.OmsOrderDetail;
import szu.yui.mall.dto.OmsOrderQueryParam;
import szu.yui.mall.model.OmsOrder;

import java.util.List;

/**
 * 订单自定义查询DAO/MAPPER
 */
public interface OmsOrderDao {
    /**
     * 条件查询订单
     * @param queryParam
     * @return
     */
    List<OmsOrder> getList(@Param("queryParam")OmsOrderQueryParam queryParam);

    /**
     * 批量发货
     * @param deliveryParamList
     * @return
     */
    int delivery(@Param("list") List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 获取订单详情
     * @param id
     * @return
     */
    OmsOrderDetail getDetail(@Param("id") Long id);
}
