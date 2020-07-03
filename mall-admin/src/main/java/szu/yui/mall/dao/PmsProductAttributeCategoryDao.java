package szu.yui.mall.dao;

import szu.yui.mall.dto.PmsProductAttributeCategoryItem;

import java.util.List;

/**
 * 自定义商品属性分类DAO
 */
public interface PmsProductAttributeCategoryDao {
    /**
     * 获取包含商品属性的商品属性分类表
     * @return
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
