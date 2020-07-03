package szu.yui.mall.service;

import szu.yui.mall.dto.OmsOrderReturnApplyResult;
import szu.yui.mall.dto.OmsReturnApplyQueryParam;
import szu.yui.mall.dto.OmsUpdateStatusParam;
import szu.yui.mall.model.OmsOrderReturnApply;

import java.util.List;

/**
 * 订单退货申请管理Service
 */
public interface OmsOrderReturnApplyService {
    /**
     * 分页查询申请
     * @return
     */
    List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageNum, Integer pageSize);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int delete(List<Long> ids);

    /**
     * 修改申请状态
     * @param id
     * @param statusParam
     * @return
     */
    int updateStatus(Long id, OmsUpdateStatusParam statusParam);

    /**
     * 获取指定申请信息
     * @param id
     * @return
     */
    OmsOrderReturnApplyResult getItem(Long id);
}
