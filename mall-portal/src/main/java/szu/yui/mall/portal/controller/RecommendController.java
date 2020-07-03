package szu.yui.mall.portal.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import szu.yui.mall.common.api.CommonPage;
import szu.yui.mall.common.api.CommonResult;
import szu.yui.mall.portal.domain.Product;
import szu.yui.mall.portal.domain.Rating;
import szu.yui.mall.portal.domain.RatingCreate;
import szu.yui.mall.portal.service.RecommendService;

import java.util.HashMap;
import java.util.List;

@Controller
@Api(tags = "RecommendController", description = "商品推荐管理")
@RequestMapping("/rec")
public class RecommendController {
    @Autowired
    private RecommendService recommendService;

    @ApiOperation("基于物品的协同过滤获取用户的推荐列表")
    @RequestMapping(value = "/CFItem/{memberId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Product>> getCFItemRecList(@PathVariable Integer memberId){
        List<Product> list = recommendService.getCFItemRecList(memberId);
        return CommonResult.success(list);
    }

    @ApiOperation("基于内容的获取物品的推荐列表")
    @RequestMapping(value = "/ContentBase/{productId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Product>> getContentRecList(@PathVariable Integer productId){
        List<Product> list = recommendService.getContentRecList(productId);
        return CommonResult.success(list);
    }

    @ApiOperation("基于内容的获取页面推荐列表")
    @RequestMapping(value = "/ContentRecPage", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Product>> getContentRecPage(@RequestParam("ids") List<Integer> ids,
                                                               @RequestParam(value = "pageSize", defaultValue = "4") Integer pageSize,
                                                               @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
        List<Product> list = recommendService.getContentRecPage(ids, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation("基于物品的协同过滤的获取页的推荐列表")
    @RequestMapping(value = "/CFItemForPID/{productId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Product>> getCFItemRecListForPID(@PathVariable Integer productId){
        List<Product> list = recommendService.getCFItemRecListForPID(productId);
        return CommonResult.success(list);
    }

    @ApiOperation("获取可选择的商品ID")
    @RequestMapping(value = "/getProductIds", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Integer>> getProductIds(){
        List<Integer> productIds = recommendService.getAll();
        return CommonResult.success(productIds);
    }

    @ApiOperation("获取热门评论商品")
    @RequestMapping(value = "/getMostComments", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Product>> getHotProducts(){
        List<Product> hotProducts = recommendService.getCommentMostList();
        return CommonResult.success(hotProducts);
    }

    @ApiOperation("获取好物推荐")
    @RequestMapping(value = "/getNiceProducts", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Product>> getNiceProducts(){
        List<Product> niceProducts = recommendService.getNiceProductList();
        return CommonResult.success(niceProducts);
    }

    @ApiOperation("获取商品详情")
    @RequestMapping(value = "/getProductDetail/{productId}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Product> getProductDetail(@PathVariable Integer productId){
        Product product = recommendService.getProductDetail(productId);
        return CommonResult.success(product);
    }

    @ApiOperation("根据用户id获取推荐列表")
    @RequestMapping(value = "/getRecList/{memberId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Product>> getRecListByMemberId(@PathVariable Integer memberId){
        List<Product> recList = recommendService.getRecListByMemberId(memberId);
        return CommonResult.success(recList);
    }

    @ApiOperation("根据商品ID获取各个评分的人数")
    @RequestMapping(value = "/getRateCount/{productId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<HashMap<String, Integer>> getRateCount(@PathVariable Integer productId){
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 1; i <= 5; i++){
            Rating rating = recommendService.getRate(productId, i);
            map.put(String.valueOf(i), rating.getCount());
        }
        return CommonResult.success(map);
    }
}
