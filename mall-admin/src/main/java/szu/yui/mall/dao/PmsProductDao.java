package szu.yui.mall.dao;

import org.apache.ibatis.annotations.Param;
import szu.yui.mall.dto.PmsProductResult;

/**
 * 商品自定义DAO
 */
public interface PmsProductDao {
    /**
     * 获取商品编辑信息
     */
    PmsProductResult getUpdateInfo(@Param("id") Integer id);
}
