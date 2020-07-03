package szu.yui.mall.service;

import szu.yui.mall.dto.PmsProductAttributeCategoryItem;
import szu.yui.mall.model.PmsProductAttributeCategory;

import java.util.List;

/**
 * 商品属性分类Service
 */
public interface PmsProductAttributeCategoryService {
    /**
     * 创建属性分类
     * @param name
     * @return
     */
    int create(String name);

    /**
     * 修改属性分类
     * @param id
     * @param name
     * @return
     */
    int update(Long id, String name);

    /**
     * 删除属性分类
     * @param id
     * @return
     */
    int delete(Long id);

    /**
     * 获取属性分类详情
     * @param id
     * @return
     */
    PmsProductAttributeCategory getItem(Long id);

    /**
     * 分页查询属性分类
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum);

    /**
     * 获取包含属性的属性分类
     * @return
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
