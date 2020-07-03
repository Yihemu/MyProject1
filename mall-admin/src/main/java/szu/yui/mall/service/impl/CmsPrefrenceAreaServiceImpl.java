package szu.yui.mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import szu.yui.mall.mapper.CmsPrefrenceAreaMapper;
import szu.yui.mall.model.CmsPrefrenceArea;
import szu.yui.mall.model.CmsPrefrenceAreaExample;
import szu.yui.mall.service.CmsPrefrenceAreaService;

import java.util.List;

@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {

    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
