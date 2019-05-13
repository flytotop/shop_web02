package com.shop.controller;

import com.shop.dto.Order_forshow;
import com.shop.dto.Shop_pergoods_msg;
import com.shop.dto.User;
import com.shop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    //选中单件商品添加订单
    @RequestMapping("/addorder")
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

    //删除订单
    @RequestMapping("/delorder")
    @ResponseBody
    public String delorder(HttpSession session,Integer orderid){
        User user=(User)session.getAttribute("user");
        if (user==null){
            return "nouser";
        }else {
            return orderService.delorder(orderid);
        }
    }

    //查看订单
    @RequestMapping("getorders")
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
