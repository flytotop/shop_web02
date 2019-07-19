package com.shop.controller;

import com.shop.dto.Order_forshow;
import com.shop.dto.Shop_pergoods_msg;
import com.shop.dto.User;
import com.shop.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("order")
@Api(value = "order",description = "订单管理")
public class OrderController {
    @Autowired
    private OrderService orderService;
    //选中单件商品添加订单

    @ApiOperation(value = "添加订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "order_forshow", value = "输入收货地址d",required = false,paramType = "query", dataType = "Order_forshow"),
            @ApiImplicitParam(name = "shop_pergoods_msg", value = "密码",required = true,paramType = "query", dataType = "Shop_pergoods_msg[]")

    })
    @RequestMapping(value = "/addorder",method = RequestMethod.POST)
    @ResponseBody
    public String addorder(HttpSession session , Order_forshow order_forshow, Shop_pergoods_msg[] shop_pergoods_msg){
        User user=(User) session.getAttribute("user");
        if (user==null){
            return "nouser";
        }else {
            order_forshow.setUser_id(user.getUser_id());
            return orderService.addorder(order_forshow,shop_pergoods_msg);
        }

    }
    @ApiOperation(value = "删除订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderid", value = "订单id",required = false,paramType = "query", dataType = "Integer")
    })
    //删除订单
    @RequestMapping(value = "/delorder" ,method = RequestMethod.POST)
    @ResponseBody
    public String delorder(HttpSession session,Integer orderid){
        User user=(User)session.getAttribute("user");
        if (user==null){
            return "nouser";
        }else {
            return orderService.delorder(orderid);
        }
    }


    @ApiOperation(value = "查看订单")
    //查看订单
    @RequestMapping(value = "getorders" ,method = RequestMethod.POST)
    @ResponseBody
    public List getorders(HttpSession session){
        User user=(User)session.getAttribute("user");
        if (user==null){
            List res=new ArrayList();
            res.add("nouser");
            return res;
        }else {
            return orderService.getallorders(user.getUser_id());
        }
    }

}
