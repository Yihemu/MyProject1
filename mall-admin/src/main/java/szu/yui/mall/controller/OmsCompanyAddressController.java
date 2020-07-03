package szu.yui.mall.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import szu.yui.mall.common.api.CommonResult;
import szu.yui.mall.model.OmsCompanyAddress;
import szu.yui.mall.service.OmsCompanyAddressService;

import java.util.List;

/**
 * 收货地址Controller
 */
@Controller
@Api(tags = "OmsCompanyAddressController", description = "收货地址管理")
@RequestMapping("/companyAddress")
public class OmsCompanyAddressController {
    @Autowired
    private OmsCompanyAddressService omsCompanyAddressService;

    @ApiOperation("获取所有收货地址")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<OmsCompanyAddress>> list(){
        List<OmsCompanyAddress> companyAddressList = omsCompanyAddressService.list();
        return CommonResult.success(companyAddressList);
    }
}
