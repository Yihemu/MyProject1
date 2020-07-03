package szu.yui.mall.dao;

import org.apache.ibatis.annotations.Param;
import szu.yui.mall.model.PmsProductAttributeValue;

import java.util.List;

/**
 * 商品参数，商品自定义规格属性DAO
 */
public interface PmsProductAttributeValueDao {
    /**
     * 批量创建
     * @param productAttributeValueList
     * @return
     */
    int insertList(@Param("list") List<PmsProductAttributeValue> productAttributeValueList);
}

