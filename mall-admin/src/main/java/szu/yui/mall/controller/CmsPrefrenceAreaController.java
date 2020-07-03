package szu.yui.mall.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import szu.yui.mall.common.api.CommonResult;
import szu.yui.mall.model.CmsPrefrenceArea;
import szu.yui.mall.service.CmsPrefrenceAreaService;

import java.util.List;

@Controller
@Api(tags = "CmsPrefrenceAreaController", description = "商品优选管理")
@RequestMapping("/prefrenceArea")
public class CmsPrefrenceAreaController {
    @Autowired
    private CmsPrefrenceAreaService cmsPrefrenceAreaService;

    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ApiOperation("获取所有商品优选")
    @ResponseBody
    public CommonResult<List<CmsPrefrenceArea>> listAll(){
        StringBuilder
        List<CmsPrefrenceArea> prefrenceAreaList = cmsPrefrenceAreaService.listAll();
        return CommonResult.success(prefrenceAreaList);
    }
}
