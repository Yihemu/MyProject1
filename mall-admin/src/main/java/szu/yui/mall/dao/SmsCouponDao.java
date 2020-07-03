package szu.yui.mall.dao;

import org.apache.ibatis.annotations.Param;
import szu.yui.mall.dto.SmsCouponParam;

/**
 * 优惠券管理自定义查询Dao
 */
public interface SmsCouponDao {
    /**
     * 获取优惠券详情,包括关联信息
     * @param id
     * @return
     */
    SmsCouponParam getItem(@Param("id") Long id);
}
