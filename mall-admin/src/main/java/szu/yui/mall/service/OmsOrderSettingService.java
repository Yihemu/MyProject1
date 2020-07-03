package szu.yui.mall.service;

import szu.yui.mall.model.OmsOrderSetting;

/**
 * 订单设置
 */
public interface OmsOrderSettingService {
    /**
     * 获取指定订单设置
     * @param id
     * @return
     */
    OmsOrderSetting getItem(Long id);

    /**
     * 修改指定订单设置
     * @param id
     * @param orderSetting
     * @return
     */
    int update(Long id, OmsOrderSetting orderSetting);
}
