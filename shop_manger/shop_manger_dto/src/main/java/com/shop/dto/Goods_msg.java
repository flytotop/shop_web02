package com.shop.dto;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.List;

public class Goods_msg  implements Serializable {
    private  Integer goods_msg_id;
    private Integer second_id;
    private Data creat_time;
    private boolean goods_ishot;
    private String picature_adress;
    private String goods_price;
    private String goods_name;
    private List<Goods_Style> goods_styles;
    public Goods_msg(){}
    public Goods_msg(Integer goods_msg_id,Integer second_id,Data creat_time,boolean goods_ishot,String picature_adress,String goods_price,String goods_name,List<Goods_Style> goods_styles){
        this.goods_msg_id=goods_msg_id;
        this.second_id=second_id;
        this.creat_time=creat_time;
        this.goods_ishot=goods_ishot;
        this.picature_adress=picature_adress;
        this.goods_price=goods_price;
        this.goods_name=goods_name;
        this.goods_styles=goods_styles;
    }

    public Integer getGoods_msg_id() {
        return goods_msg_id;
    }

    public void setGoods_msg_id(Integer goods_msg_id) {
        this.goods_msg_id = goods_msg_id;
    }

    public Integer getSecond_id() {
        return second_id;
    }

    public void setSecond_id(Integer second_id) {
        this.second_id = second_id;
    }

    public Data getCreat_time() {
        return creat_time;
    }

    public void setCreat_time(Data creat_time) {
        this.creat_time = creat_time;
    }

    public boolean isGoods_ishot() {
        return goods_ishot;
    }

    public void setGoods_ishot(boolean goods_ishot) {
        this.goods_ishot = goods_ishot;
    }

    public String getPicature_adress() {
        return picature_adress;
    }

    public void setPicature_adress(String picature_adress) {
        this.picature_adress = picature_adress;
    }

    public String getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(String goods_price) {
        this.goods_price = goods_price;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public List<Goods_Style> getGoods_styles() {
        return goods_styles;
    }

    public void setGoods_styles(List<Goods_Style> goods_styles) {
        this.goods_styles = goods_styles;
    }
}
