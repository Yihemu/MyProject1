package szu.yui.mall.service;

import szu.yui.mall.model.OmsCompanyAddress;

import java.util.List;

/**
 * 收货地址Service
 */
public interface OmsCompanyAddressService {
    /**
     * 获取全部收货地址
     * @return
     */
    List<OmsCompanyAddress> list();
}
