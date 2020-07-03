package szu.yui.mall.portal.dao;

import org.apache.ibatis.annotations.Param;
import szu.yui.mall.portal.domain.SmsCouponHistoryDetail;

import java.util.List;

/**
 * 会员优惠券领取历史自定义Dao
 */
public interface SmsCouponHistoryDao {
    List<SmsCouponHistoryDetail> getDetailList(@Param("memberId") Integer memberId);
}
