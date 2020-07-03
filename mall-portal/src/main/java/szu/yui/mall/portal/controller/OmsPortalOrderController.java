package szu.yui.mall.portal.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import szu.yui.mall.common.api.CommonResult;
import szu.yui.mall.model.OmsCartItem;
import szu.yui.mall.model.OmsOrder;
import szu.yui.mall.model.OmsOrderItem;
import szu.yui.mall.portal.domain.ConfirmOrderResult;
import szu.yui.mall.portal.domain.OrderParam;
import szu.yui.mall.portal.domain.RatingCreate;
import szu.yui.mall.portal.service.OmsPortalOrderService;
import szu.yui.mall.portal.service.RecommendService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 订单管理Controller
 */
@Controller
@Api(tags = "OmsPortalOrderController", description = "订单管理")
@RequestMapping("/order")
public class OmsPortalOrderController {
    @Autowired
    private OmsPortalOrderService portalOrderService;
    @Autowired
    private RecommendService recommendService;

    @ApiOperation("根据购物车信息生成确认单信息")
    @RequestMapping(value = "/generateConfirmOrder", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<ConfirmOrderResult> generateConfirmOrder(@RequestBody List<OmsCartItem> cartItemList) {
        ConfirmOrderResult confirmOrderResult = portalOrderService.generateConfirmOrder(cartItemList);
        return CommonResult.success(confirmOrderResult);
    }

    @ApiOperation("根据购物车信息生成订单")
    @RequestMapping(value = "/generateOrder", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult generateOrder(@RequestBody OrderParam orderParam) {
        Map<String, Object> result = portalOrderService.generateOrder(orderParam);
        return CommonResult.success(result, "下单成功");
    }

    @ApiOperation("支付成功的回调")
    @RequestMapping(value = "/paySuccess", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult paySuccess(@RequestParam Long orderId) {
        Integer count = portalOrderService.paySuccess(orderId);
        return CommonResult.success(count, "支付成功");
    }

    @ApiOperation("自动取消超时订单")
    @RequestMapping(value = "/cancelTimeOutOrder", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult cancelTimeOutOrder() {
        portalOrderService.cancelTimeOutOrder();
        return CommonResult.success(null);
    }

    @ApiOperation("取消单个超时订单")
    @RequestMapping(value = "/cancelOrder", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult cancelOrder(@RequestParam Long orderId) {
        portalOrderService.sendDelayMessageCancelOrder(orderId);
        return CommonResult.success(null);
    }

    @ApiOperation("获取用户订单列表")
    @RequestMapping(value = "/listOrder",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<OmsOrder>> listOrder(){
        List<OmsOrder> orderList = portalOrderService.listOrderByMember();
        return CommonResult.success(orderList);
    }

    @ApiOperation("根据订单ID获取订单信息")
    @RequestMapping(value = "/orderItemList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult orderItemList(){
        HashMap<Long, List<OmsOrderItem>> map = portalOrderService.listOrderItemByOrderId();
        return CommonResult.success(map);
    }

    @ApiOperation("插入评分")
    @RequestMapping(value = "/insertRating", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult insertRating(@RequestBody RatingCreate ratingCreate){
        Integer count = recommendService.insertRating(ratingCreate);
        return CommonResult.success(count);
    }
}
