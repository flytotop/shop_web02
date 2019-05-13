package com.shop.mapper;

import com.shop.dto.Shopping_cart_pergoods_msg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Shop_Cart_msgMapper {
    //添加购物车信息
    void addshopping_cart_pergoods_msg(Shopping_cart_pergoods_msg shopping_cart_pergoods_msg);
    //删除购物车信息
    void delshopping_cart_pergoods_msg(@Param("id") Integer msg_cartid);
    //查看购物车信息
   List<Shopping_cart_pergoods_msg> getshopping_cart_pergoods_msg(@Param("id") Integer shop_cart_id);
}
