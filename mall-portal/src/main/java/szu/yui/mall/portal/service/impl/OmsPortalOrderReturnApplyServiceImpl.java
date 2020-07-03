package szu.yui.mall.portal.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import szu.yui.mall.mapper.OmsOrderReturnApplyMapper;
import szu.yui.mall.model.OmsOrderReturnApply;
import szu.yui.mall.portal.domain.OmsOrderReturnApplyParam;
import szu.yui.mall.portal.service.OmsPortalOrderReturnApplyService;

import java.util.Date;

/**
 * 订单退货管理Service实现类
 */
@Service
public class OmsPortalOrderReturnApplyServiceImpl implements OmsPortalOrderReturnApplyService {
    @Autowired
    private OmsOrderReturnApplyMapper returnApplyMapper;
    @Override
    public int create(OmsOrderReturnApplyParam returnApply) {
        OmsOrderReturnApply realApply = new OmsOrderReturnApply();
        BeanUtils.copyProperties(returnApply,realApply);
        realApply.setCreateTime(new Date());
        realApply.setStatus(0);
        return returnApplyMapper.insert(realApply);
    }
}
