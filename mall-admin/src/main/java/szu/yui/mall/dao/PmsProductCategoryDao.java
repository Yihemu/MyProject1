package szu.yui.mall.dao;

import szu.yui.mall.dto.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * 商品分类自定义DAO
 */
public interface PmsProductCategoryDao {
    /**
     * 获取包括子分类的商品分类列表
     * @return
     */
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
