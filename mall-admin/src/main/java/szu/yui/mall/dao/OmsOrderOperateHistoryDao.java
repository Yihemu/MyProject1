package szu.yui.mall.dao;

import org.apache.ibatis.annotations.Param;
import szu.yui.mall.model.OmsOrderOperateHistory;

import java.util.List;

/**
 * 订单操作记录自动以DAO/MAPPER
 */
public interface OmsOrderOperateHistoryDao {
    /**
     * 批量创建
     * @param operateHistoryList
     * @return
     */
    int insertList(@Param("list")List<OmsOrderOperateHistory> operateHistoryList);
}
