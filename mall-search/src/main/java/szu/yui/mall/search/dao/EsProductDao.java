package szu.yui.mall.search.dao;

import org.apache.ibatis.annotations.Param;
import szu.yui.mall.search.domain.EsProduct;

import java.util.List;

/**
 * 搜索系统中的商品管理管理自定义Dao
 */

public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Integer id);
}
