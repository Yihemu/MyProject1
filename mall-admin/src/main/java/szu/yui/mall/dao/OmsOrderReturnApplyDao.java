package szu.yui.mall.dao;

import org.apache.ibatis.annotations.Param;
import szu.yui.mall.dto.OmsOrderReturnApplyResult;
import szu.yui.mall.dto.OmsReturnApplyQueryParam;
import szu.yui.mall.model.OmsOrderReturnApply;

import java.util.List;

/**
 * 订单退货申请自定义DAO/MAPPER
 */
public interface OmsOrderReturnApplyDao {
    /**
     * 查询申请列表
     * @param queryParam 数据传输对象 查询参数
     * @return
     */
    List<OmsOrderReturnApply> getList(@Param("queryParam") OmsReturnApplyQueryParam queryParam);

    /**
     * 根据ID获取退货申请详情
     * @return
     */
    OmsOrderReturnApplyResult getDetail(@Param("id") Long id);
}
