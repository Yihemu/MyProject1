package szu.yui.mall.dao;

import org.apache.ibatis.annotations.Param;
import szu.yui.mall.model.CmsPrefrenceAreaProductRelation;

import java.util.List;

/**
 * 自定义优选和商品关系操作
 */
public interface CmsPrefrenceAreaProductRelationDao {
    /**
     * 批量创建
     * @param prefrenceAreaProductRelationList
     * @return
     */
    int insertList(@Param("list") List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList);
}
