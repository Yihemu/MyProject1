package szu.yui.mall.dao;

import org.apache.ibatis.annotations.Param;
import szu.yui.mall.model.PmsProductVertifyRecord;

import java.util.List;

/**
 * 商品审核日志自定义DAO
 */
public interface PmsProductVertifyRecordDao {
    /**
     * 批量创建
     * @param list
     * @return
     */
    int insertList(@Param("list") List<PmsProductVertifyRecord> list);
}
