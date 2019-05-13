package com.shop.mapper;

import com.shop.dto.Shopping_cart;
import org.apache.ibatis.annotations.Param;

public interface Shop_CartMapper {
    //添加用户购物车对象
    int addshop_cart(Shopping_cart shop_cart);
    //查询用户是否具有购物车对象
    Shopping_cart isexcit_shop_cart(@Param("id") Integer user_id);

}
