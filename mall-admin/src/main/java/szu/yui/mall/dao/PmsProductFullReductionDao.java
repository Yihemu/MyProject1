package szu.yui.mall.dao;

import org.apache.ibatis.annotations.Param;
import szu.yui.mall.model.PmsProductFullReduction;

import java.util.List;

/**
 * 自定义商品满减DAO
 */
public interface PmsProductFullReductionDao {
    /**
     * 批量创建
     * @param productFullReductionList
     * @return
     */
    int insertList(@Param("list") List<PmsProductFullReduction> productFullReductionList);
}
