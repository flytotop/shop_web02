package com.shop.dto;

import lombok.Data;

import java.io.Serializable;


public class Shopping_cart_pergoods_msg  implements Serializable {
    private Integer shop_msg_id;
    private Integer msg_id;
    private Integer shopping_cart_id;
    private String goods_name;
    private String goods_price;
    private String goods_style;
    private String goods_size;
    private String picture_adress;
    private Integer goods_num;

    public Shopping_cart_pergoods_msg() {
    }

    public Shopping_cart_pergoods_msg(Integer shop_msg_id, Integer msg_id, Integer shopping_cart_id, String goods_name, String goods_price, String goods_style, String goods_size, String picture_adress, Integer goods_num) {
        this.shop_msg_id = shop_msg_id;
        this.msg_id = msg_id;
        this.shopping_cart_id = shopping_cart_id;
        this.goods_name = goods_name;
        this.goods_price = goods_price;
        this.goods_style = goods_style;
        this.goods_size = goods_size;
        this.picture_adress = picture_adress;
        this.goods_num = goods_num;
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

    public Integer getShopping_cart_id() {
        return shopping_cart_id;
    }

    public void setShopping_cart_id(Integer shopping_cart_id) {
        this.shopping_cart_id = shopping_cart_id;
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

    public Integer getGoods_num() {
        return goods_num;
    }

    public void setGoods_num(Integer goods_num) {
        this.goods_num = goods_num;
    }
}
