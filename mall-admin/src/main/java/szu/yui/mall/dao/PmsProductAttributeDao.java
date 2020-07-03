package szu.yui.mall.dao;

import org.apache.ibatis.annotations.Param;
import szu.yui.mall.dto.ProductAttrInfo;

import java.util.List;

/**
 * 自定义商品属性DAO
 */
public interface PmsProductAttributeDao {
    /**
     * 获取商品分类对应属性列表
     * @param productCategoryId
     * @return
     */
    List<ProductAttrInfo> getProductAttrInfo(@Param("id") Long productCategoryId);
}
