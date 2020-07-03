package szu.yui.mall.service;

import szu.yui.mall.model.OmsOrderReturnReason;

import java.util.List;

/**
 * 订单退货原因管理Service
 */
public interface OmsOrderReturnReasonService {
    /**
     * 添加订单退货原因
     * @return
     */
    int create(OmsOrderReturnReason returnReason);

    /**
     * 修改退货原因
     * @param id
     * @param returnReason
     * @return
     */
    int update(Long id, OmsOrderReturnReason returnReason);

    /**
     * 批量删除退货原因
     * @param ids
     * @return
     */
    int delete(List<Long> ids);

    /**
     * 分页获取退货原因
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<OmsOrderReturnReason> list(Integer pageSize, Integer pageNum);

    /**
     * 批量修改退货原因状态
     * @param ids
     * @param status
     * @return
     */
    int updateStatus(List<Long> ids, Integer status);

    /**
     * 获取单个推过原因详情
     * @param id
     * @return
     */
    OmsOrderReturnReason getItem(Long id);
}
