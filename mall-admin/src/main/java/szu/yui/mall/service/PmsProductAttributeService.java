package szu.yui.mall.service;

import org.springframework.transaction.annotation.Transactional;
import szu.yui.mall.dto.PmsProductAttributeParam;
import szu.yui.mall.dto.ProductAttrInfo;
import szu.yui.mall.model.PmsProductAttribute;

import java.util.List;

/**
 * 商品属性Service
 */
public interface PmsProductAttributeService {
    /**
     * 根据分类分页获取商品属性
     * @param cid 分类id
     * @param type 0->属性；2->参数
     * @return
     */
    List<PmsProductAttribute> getList(Long cid, Integer type, Integer pageSize, Integer pageNum);

    /**
     * 添加商品属性
     */
    @Transactional
    int create(PmsProductAttributeParam pmsProductAttributeParam);

    /**
     * 修改商品属性
     */
    int update(Long id, PmsProductAttributeParam productAttributeParam);

    /**
     * 获取单个商品属性信息
     */
    PmsProductAttribute getItem(Long id);

    /**
     * 批量删除商品属性
     * @param ids
     * @return
     */
    @Transactional
    int delete(List<Long> ids);

    /**
     * 获取和分类相关的商品属性
     * @param productCategoryId
     * @return
     */
    List<ProductAttrInfo> getProductAttrInfo(Long productCategoryId);
}
