package szu.yui.mall.portal.dao;

import org.apache.ibatis.annotations.Param;
import szu.yui.mall.model.OmsOrderItem;

import java.util.List;

/**
 * 订单商品信息自定义Dao
 */
public interface PortalOrderItemDao {
    int insertList(@Param("list") List<OmsOrderItem> list);
}
