package com.shop.mapper;

import com.shop.dto.Shop_pergoods_msg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Shop_Pergoods_MsgMapper {
    //添加商品到订单信息表中
    void addgoodsto_shop_msg(Shop_pergoods_msg shop_pergoods_msg);
    //查看商品订单信息
    List<Shop_pergoods_msg> getshop_pergoods_msg(@Param("id") Integer order_id);
}
