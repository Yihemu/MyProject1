package szu.yui.mall.service;

import szu.yui.mall.model.CmsPrefrenceArea;

import java.util.List;

/**
 * 优选选专区service
 */
public interface CmsPrefrenceAreaService {
    /**
     * 获取所有优先专区
     * @return
     */
    List<CmsPrefrenceArea> listAll();
}
