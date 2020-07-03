package szu.yui.mall.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import szu.yui.mall.common.api.CommonPage;
import szu.yui.mall.common.api.CommonResult;
import szu.yui.mall.dto.OmsOrderReturnApplyResult;
import szu.yui.mall.dto.OmsReturnApplyQueryParam;
import szu.yui.mall.dto.OmsUpdateStatusParam;
import szu.yui.mall.model.OmsOrderReturnApply;
import szu.yui.mall.service.OmsOrderReturnApplyService;

import java.util.List;

@Api(tags = "OmsOrderReturnApplyController", description = "订单退货申请管理")
@Controller
@RequestMapping("returnApply")
public class OmsOrderReturnApplyController {
    @Autowired
    private OmsOrderReturnApplyService returnApplyService;

    @ApiOperation("分页查询退货申请")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<OmsOrderReturnApply>> list(OmsReturnApplyQueryParam returnApplyQueryParam,
                                                                    @RequestParam(value = "pageNum", defaultValue = "0") Integer pageNum,
                                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize){
        List<OmsOrderReturnApply> returnApplyList = returnApplyService.list(returnApplyQueryParam, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(returnApplyList));
    }

    @ApiOperation("批量删除申请")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@RequestParam(value = "ids") List<Long> ids){
        int count = returnApplyService.delete(ids);
        if(count > 0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改申请状态")
    @RequestMapping(value = "/update/status/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateStatus(@PathVariable Long id, @RequestBody OmsUpdateStatusParam updateStatusParam){
        int count = returnApplyService.updateStatus(id, updateStatusParam);
        if(count > 0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("获取退货申请详情")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<OmsOrderReturnApply> getItem(@PathVariable Long id){
        OmsOrderReturnApplyResult result = returnApplyService.getItem(id);
        return CommonResult.success(result);
    }
}
