package szu.yui.mall.service;

import szu.yui.mall.model.PmsSkuStock;

import java.util.List;

/**
 * sku商品库存管理Service
 */
public interface PmsSkuStockService {
    /**
     * 根据产品id和skuCode模糊搜索
     */
    List<PmsSkuStock> getList(Integer pid, String keyword);

    /**
     * 批量更新商品库存信息
     */
    int update(Integer pid, List<PmsSkuStock> skuStockList);
}
