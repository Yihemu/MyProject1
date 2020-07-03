package szu.yui.mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import szu.yui.mall.mapper.OmsCompanyAddressMapper;
import szu.yui.mall.model.OmsCompanyAddress;
import szu.yui.mall.model.OmsCompanyAddressExample;
import szu.yui.mall.service.OmsCompanyAddressService;

import java.util.List;

/**
 * 收货地址管理Service实现类
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper omsCompanyAddressMapper;

    @Override
    public List<OmsCompanyAddress> list() {
        return omsCompanyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
