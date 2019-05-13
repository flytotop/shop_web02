package com.shop.service.impl;

import com.shop.dto.Order_forshow;
import com.shop.dto.Shop_pergoods_msg;
import com.shop.mapper.OrderMapper;
import com.shop.mapper.Shop_Pergoods_MsgMapper;
import com.shop.service.OrderService;
import com.shop.utils.DatatoString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private Shop_Pergoods_MsgMapper shop_pergoods_msgMapper;

    @Override
    public String addorder(Order_forshow order_forshow,Shop_pergoods_msg[] shop_pergoods_msg) {

        try {
            String data= DatatoString.datatoString();
            order_forshow.setCreattime(data);
            orderMapper.addorder(order_forshow);
            for (Shop_pergoods_msg shop_pergoods_msg1:shop_pergoods_msg) {
                shop_pergoods_msg1.setOrder_id(order_forshow.getOrder_id());
                shop_pergoods_msgMapper.addgoodsto_shop_msg(shop_pergoods_msg1);
            }
            return "true";
        }catch (Exception e){
            e.printStackTrace();
          return "false";
        }

    }

    @Override
    public String delorder(Integer order_id) {
        try {
            orderMapper.delorder(order_id);
            return "true";
        }catch (Exception e){
            e.printStackTrace();
            return "false";
        }
    }

    @Override
    public List<Order_forshow> getallorders(Integer user_id) {
        return orderMapper.getorderforshow(user_id);
    }
}
