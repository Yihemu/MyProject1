package szu.yui.mall.dao;

import org.apache.ibatis.annotations.Param;
import szu.yui.mall.model.CmsSubjectProductRelation;

import java.util.List;

/**
 * 自定义商品和专题关系操作
 */
public interface CmsSubjectProductRelationDao {
    /**
     * 批量创建
     * @param subjectProductRelationList
     * @return
     */
    int insertList(@Param("list") List<CmsSubjectProductRelation> subjectProductRelationList);
}
