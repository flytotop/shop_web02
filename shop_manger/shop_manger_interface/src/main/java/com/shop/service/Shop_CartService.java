package com.shop.service;

import com.shop.dto.Shopping_cart_pergoods_msg;

import java.util.List;

public interface Shop_CartService {
    //查看购物车
    List<Shopping_cart_pergoods_msg> getshop_cart(Integer user_id);
    //添加购物车
    String addshop_cart(Shopping_cart_pergoods_msg shopping_cart_pergoods_msg, Integer user_id);
    //删除购物车商品
    String delshop_cart(Integer msg_cartid);


}
