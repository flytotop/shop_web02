package com.shop.controller;

import com.shop.dto.Shopping_cart_pergoods_msg;
import com.shop.dto.User;
import com.shop.service.Shop_CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("shopcart")
public class Shop_CartController {
    @Autowired
    private Shop_CartService shop_cartService;

    //添加商品到购物车
    @RequestMapping("/addshopcart")
    @ResponseBody
    public String addshopcart(HttpSession session , Shopping_cart_pergoods_msg shopping_cart_pergoods_msg){
        User user=(User)session.getAttribute("user");
        if (user==null){
            return "nouser";
        }else {
            return shop_cartService.addshop_cart(shopping_cart_pergoods_msg ,user.getUser_id());
        }
    }

    //删除部分购物车商品
    @RequestMapping("/delshopcart")
    @ResponseBody
    public String delshopcart(HttpSession session ,Integer msg_cartid){
        User user=(User)session.getAttribute("user");
        if (user==null){
            return "nouser";
        }else {
            return shop_cartService.delshop_cart(msg_cartid);
        }
    }

    //查看购物车
    @RequestMapping("/getshopcart")
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
