package szu.yui.mall.dao;

import org.apache.ibatis.annotations.Param;
import szu.yui.mall.model.PmsMemberPrice;

import java.util.List;

/**
 * 自定义会员价格DAO
 */
public interface PmsMemberPriceDao {
    /**
     * 批量创建
     * @param memberPriceList
     * @return
     */
    int insertList(@Param("list") List<PmsMemberPrice> memberPriceList);
}
