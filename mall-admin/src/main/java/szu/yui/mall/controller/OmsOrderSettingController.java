package szu.yui.mall.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import szu.yui.mall.common.api.CommonResult;
import szu.yui.mall.model.OmsOrderSetting;
import szu.yui.mall.service.OmsOrderSettingService;

@Controller
@Api(tags = "OmsOrderSettingController", description = "订单设置管理")
@RequestMapping("/orderSetting")
public class OmsOrderSettingController {
    @Autowired
    private OmsOrderSettingService orderSettingService;

    @ApiOperation("获取指定订单设置")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    private CommonResult<OmsOrderSetting> getItem(@PathVariable Long id){
        return CommonResult.success(orderSettingService.getItem(id));
    }

    @ApiOperation("修改指定订单设置")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    private CommonResult update(@PathVariable("id") Long id, @RequestBody OmsOrderSetting orderSetting){
        int count = orderSettingService.update(id, orderSetting);
        if(count > 0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}
