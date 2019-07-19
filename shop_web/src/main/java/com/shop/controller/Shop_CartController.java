package com.shop.controller;

import com.shop.dto.Shopping_cart_pergoods_msg;
import com.shop.dto.User;
import com.shop.service.Shop_CartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("shopcart")
@Api(value = "shopcart" ,description = "购物车管理")
public class Shop_CartController {
    @Autowired
    private Shop_CartService shop_cartService;

    //添加商品到购物车
    @ApiOperation("添加商品到购物车")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "msg_id" ,value = "商品id" ,required = false,paramType = "query", dataType = "Integer"),
            @ApiImplicitParam(name = "goods_name" ,value = "商品名称", required = false,paramType = "query" ,dataType = "String"),
            @ApiImplicitParam(name = "goods_price",value = "商品价格", required = false,paramType = "query" ,dataType = "String"),
            @ApiImplicitParam(name = "goods_style",value = "商品款式", required = false,paramType = "query" ,dataType = "String"),
            @ApiImplicitParam(name = "goods_size",value = "商品大小", required = false,paramType = "query" ,dataType = "String"),
            @ApiImplicitParam(name = "picture_adress",value = "图片地址", required = false,paramType = "query" ,dataType = "String"),
            @ApiImplicitParam(name = "goods_num",value = "商品数量", required = false,paramType = "query" ,dataType = "Integer")
    })
    @RequestMapping(value = "/addshopcart" ,method = RequestMethod.POST)
    @ResponseBody
    public String addshopcart(HttpSession session , Shopping_cart_pergoods_msg shopping_cart_pergoods_msg){
        User user=(User)session.getAttribute("user");
        if (user==null){
            return "nouser";
        }else {
            return shop_cartService.addshop_cart(shopping_cart_pergoods_msg ,user.getUser_id());
        }
    }
    @ApiOperation("添加商品到购物车")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "msg_cartid" ,value = "购物车表中的单件商品id" ,required = false,paramType = "query", dataType = "Integer")
    })
    //删除部分购物车商品
    @RequestMapping(value = "/delshopcart" ,method = RequestMethod.POST)
    @ResponseBody
    public String delshopcart(HttpSession session ,Integer msg_cartid){
        User user=(User)session.getAttribute("user");
        if (user==null){
            return "nouser";
        }else {
            return shop_cartService.delshop_cart(msg_cartid);
        }
    }

    @ApiOperation("查看购物车")
    //查看购物车
    @RequestMapping(value = "/getshopcart",method = RequestMethod.POST)
    @ResponseBody
    public List getshopcart(HttpSession session){
        User user=(User)session.getAttribute("user");
        if (user==null){
            List res=new ArrayList();
            res.add("nouser");
            return res;
        }else {
            return shop_cartService.getshop_cart(user.getUser_id());
        }
    }
}
