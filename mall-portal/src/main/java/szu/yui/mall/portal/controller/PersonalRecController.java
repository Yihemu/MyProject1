package szu.yui.mall.portal.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import szu.yui.mall.common.api.CommonResult;
import szu.yui.mall.portal.domain.Product;
import szu.yui.mall.portal.service.RecommendService;

import java.util.List;

@Controller
@Api(tags = "PersonalRecController", description = "个性化推荐管理")
@RequestMapping("/prec")
public class PersonalRecController {
    @Autowired
    private RecommendService recommendService;

    @ApiOperation("获取用户推荐列表")
    @RequestMapping(value = "/getUserRecs", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Product>> getUserRecs(){
        List<Product> products = recommendService.getUserRecs();
        return CommonResult.success(products);
    }
}
