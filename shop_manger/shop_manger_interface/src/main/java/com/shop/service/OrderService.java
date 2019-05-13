package com.shop.service;

import com.shop.dto.Order;
import com.shop.dto.Order_forshow;
import com.shop.dto.Shop_pergoods_msg;

import java.util.List;

public interface OrderService {
    //新增订单
    String addorder(Order_forshow order_forshow, Shop_pergoods_msg[] shop_pergoods_msg);
    //删除订单
    String delorder(Integer order_id);
    //查看订单
    List<Order_forshow> getallorders(Integer user_id);
}
