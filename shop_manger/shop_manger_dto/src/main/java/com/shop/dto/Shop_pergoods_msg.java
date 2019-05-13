package com.shop.dto;

import java.io.Serializable;

public class Shop_pergoods_msg  implements Serializable {
    private Integer shop_msg_id;
    private Integer msg_id;
    private Integer order_id;
    private String goods_name;
    private String goods_price;
    private String goods_style;
    private String goods_size;
    private String picture_adress;
    private String shop_goods_name;
    public Shop_pergoods_msg(){}
    public Shop_pergoods_msg(Integer shop_msg_id,Integer msg_id,Integer order_id,String goods_name,String goods_price,String goods_style,String goods_size,String picture_adress,String shop_goods_name){
        this.shop_msg_id=shop_msg_id;
        this.msg_id=msg_id;
        this.order_id=order_id;
        this.goods_name=goods_name;
        this.goods_price=goods_price;
        this.goods_style=goods_style;
        this.goods_size=goods_size;
        this.picture_adress=picture_adress;
        this.shop_goods_name=shop_goods_name;

    }

    public Integer getShop_msg_id() {
        return shop_msg_id;
    }

    public void setShop_msg_id(Integer shop_msg_id) {
        this.shop_msg_id = shop_msg_id;
    }

    public Integer getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(Integer msg_id) {
        this.msg_id = msg_id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(String goods_price) {
        this.goods_price = goods_price;
    }

    public String getGoods_style() {
        return goods_style;
    }

    public void setGoods_style(String goods_style) {
        this.goods_style = goods_style;
    }

    public String getGoods_size() {
        return goods_size;
    }

    public void setGoods_size(String goods_size) {
        this.goods_size = goods_size;
    }

    public String getPicture_adress() {
        return picture_adress;
    }

    public void setPicture_adress(String picture_adress) {
        this.picture_adress = picture_adress;
    }

    public String getShop_goods_name() {
        return shop_goods_name;
    }

    public void setShop_goods_name(String shop_goods_name) {
        this.shop_goods_name = shop_goods_name;
    }
}
