package szu.yui.mall.dao;

import org.apache.ibatis.annotations.Param;
import szu.yui.mall.model.PmsProductLadder;

import java.util.List;

/**
 * 自定义会员梯度价格DAO
 */
public interface PmsProductLadderDao {
    /**
     * 批量创建
     * @param productLadderList
     * @return
     */
    int insertList(@Param("list") List<PmsProductLadder> productLadderList);
}
