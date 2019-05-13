package com.shop.mapper;

import com.shop.dto.Order_forshow;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    //直接选定商品支付
    void payby_directly(@Param("user_id")   Integer user_id,@Param("receive_id") Integer receive_id ,@Param("time") String time);

    //添加订单
    int addorder(Order_forshow order_forshow);

    //查看订单
    List<Order_forshow> getorderforshow(@Param("id") Integer user_id);

    //删除订单
    void delorder(@Param("id") Integer order_id);


    List<com.shop.dto.Order> getorders(@Param("id") Integer user_id);
}
