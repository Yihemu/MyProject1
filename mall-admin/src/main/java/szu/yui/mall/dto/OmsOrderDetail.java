package szu.yui.mall.dto;

import lombok.Getter;
import lombok.Setter;
import szu.yui.mall.model.OmsOrder;
import szu.yui.mall.model.OmsOrderItem;
import szu.yui.mall.model.OmsOrderOperateHistory;

import java.util.List;

/**
 * 订单详细信息
 */
public class OmsOrderDetail extends OmsOrder {
    @Getter
    @Setter
    private List<OmsOrderItem> orderItemList;
    @Getter
    @Setter
    private List<OmsOrderOperateHistory> historyList;
}
