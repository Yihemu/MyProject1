package szu.yui.mall.dto;

import lombok.Getter;
import lombok.Setter;
import szu.yui.mall.model.OmsCompanyAddress;
import szu.yui.mall.model.OmsOrderReturnApply;

/**
 * 申请信息封装
 */

public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    @Getter
    @Setter
    private OmsCompanyAddress companyAddress;
}
