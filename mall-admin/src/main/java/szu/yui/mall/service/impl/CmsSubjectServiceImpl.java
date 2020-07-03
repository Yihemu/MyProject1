package szu.yui.mall.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import szu.yui.mall.mapper.CmsSubjectMapper;
import szu.yui.mall.model.CmsSubject;
import szu.yui.mall.model.CmsSubjectExample;
import szu.yui.mall.service.CmsSubjectService;

import java.util.List;

@Service
public class CmsSubjectServiceImpl implements CmsSubjectService {
    @Autowired
    private CmsSubjectMapper cmsSubjectMapper;

    @Override
    public List<CmsSubject> listAll() {
        return cmsSubjectMapper.selectByExample(new CmsSubjectExample());
    }

    @Override
    public List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        CmsSubjectExample example = new CmsSubjectExample();
        CmsSubjectExample.Criteria criteria = example.createCriteria();
        if(!StringUtils.isEmpty(keyword)){
            criteria.andTitleLike("%" + keyword + "%");
        }
        return cmsSubjectMapper.selectByExample(example);
    }
}
