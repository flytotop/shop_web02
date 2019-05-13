package com.shop.service.impl;

import com.shop.dto.Shopping_cart;
import com.shop.dto.Shopping_cart_pergoods_msg;
import com.shop.mapper.Shop_CartMapper;
import com.shop.mapper.Shop_Cart_msgMapper;
import com.shop.service.Shop_CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Shop_CartServiceImpl implements Shop_CartService {
    @Autowired
    private Shop_Cart_msgMapper shop_cart_msgMapper;
    @Autowired
    private Shop_CartMapper shop_cartMapper;
    @Override
    public List<Shopping_cart_pergoods_msg> getshop_cart(Integer user_id) {
        Shopping_cart shopping_cart=shop_cartMapper.isexcit_shop_cart(user_id);
        Integer shop_cart_id=shopping_cart.getShopping_cart_id();

        if (null==shop_cart_id){
            shopping_cart=new Shopping_cart();
            shopping_cart.setUser_id(user_id);
            shop_cartMapper.addshop_cart(shopping_cart);
            shop_cart_id=shopping_cart.getShopping_cart_id();
        }
        List<Shopping_cart_pergoods_msg> list=new ArrayList<>();
        try {
            Integer id=shopping_cart.getShopping_cart_id();
            String name;
            list = shop_cart_msgMapper.getshopping_cart_pergoods_msg(shopping_cart.getShopping_cart_id());
        }catch (Exception e){
            e.printStackTrace();

        }

        return list;
    }

    @Override
    public String addshop_cart(Shopping_cart_pergoods_msg shopping_cart_pergoods_msg,Integer user_id) {

        try {
            Shopping_cart shopping_cart=shop_cartMapper.isexcit_shop_cart(user_id);
            if (shopping_cart == null) {
                shopping_cart=new Shopping_cart();
                shopping_cart.setUser_id(user_id);
                shop_cartMapper.addshop_cart(shopping_cart);
                shopping_cart_pergoods_msg.setShopping_cart_id(shopping_cart.getShopping_cart_id());
            }
            shopping_cart_pergoods_msg.setShopping_cart_id(shopping_cart.getShopping_cart_id());
            shop_cart_msgMapper.addshopping_cart_pergoods_msg(shopping_cart_pergoods_msg);
            return "true";
        }catch (Exception e){
            e.printStackTrace();
            return "false";
        }
    }

    @Override
    public String delshop_cart(Integer msg_cartid) {
        try {
            shop_cart_msgMapper.delshopping_cart_pergoods_msg(msg_cartid);
            return "true";
        }catch (Exception e){
            e.printStackTrace();
            return "false";
        }
    }
}
