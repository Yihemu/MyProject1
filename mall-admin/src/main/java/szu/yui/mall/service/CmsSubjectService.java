package szu.yui.mall.service;

import szu.yui.mall.model.CmsSubject;

import java.util.List;

/**
 * 专题Service
 */
public interface CmsSubjectService {
    /**
     * 查询所有专题
     * @return
     */
    List<CmsSubject> listAll();

    /**
     * 分页查询专题
     * @param keyword
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize);
}
