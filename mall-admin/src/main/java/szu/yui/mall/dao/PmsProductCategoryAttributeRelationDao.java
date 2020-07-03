package szu.yui.mall.dao;

import org.apache.ibatis.annotations.Param;
import szu.yui.mall.model.PmsProductCategoryAttributeRelation;

import java.util.List;

/**
 * 自定义商品分类和属性关系的DAO
 */
public interface PmsProductCategoryAttributeRelationDao {
    /**
     * 批量创建
     * @param productCategoryAttributeRelationList
     * @return
     */
    int insertList(@Param("list") List<PmsProductCategoryAttributeRelation> productCategoryAttributeRelationList);
}
