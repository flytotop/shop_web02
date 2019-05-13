package com.shop.dto;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class Goods implements Serializable {
    private Integer msg_id;
    private Integer secondlevel_id;
    private Date creat_time;
    private boolean goods_ishot;
    private String picture;
    private Integer goods_price;
    private String goods_name;
    List<Goods_Style> goods_styles;
    List<Picture> pictures;

    public Goods(Integer msg_id, Integer secondlevel_id, Date creat_time, boolean goods_ishot, String picture, Integer goods_price, String goods_name, List<Goods_Style> goods_styles, List<Picture> pictures) {
        this.msg_id = msg_id;
        this.secondlevel_id = secondlevel_id;
        this.creat_time = creat_time;
        this.goods_ishot = goods_ishot;
        this.picture = picture;
        this.goods_price = goods_price;
        this.goods_name = goods_name;
        this.goods_styles = goods_styles;
        this.pictures = pictures;
    }

    public List<Picture> getPictures() {
        return pictures;

    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public Goods() {
    }

    public Goods(Integer msg_id, Integer secondlevel_id, Date creat_time, boolean goods_ishot, String picture, Integer goods_price, String goods_name, List<Goods_Style> goods_styles) {
        this.msg_id = msg_id;
        this.secondlevel_id = secondlevel_id;
        this.creat_time = creat_time;
        this.goods_ishot = goods_ishot;
        this.picture = picture;
        this.goods_price = goods_price;
        this.goods_name = goods_name;
        this.goods_styles = goods_styles;
    }

    public Integer getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(Integer msg_id) {
        this.msg_id = msg_id;
    }

    public Integer getSecondlevel_id() {
        return secondlevel_id;
    }

    public void setSecondlevel_id(Integer secondlevel_id) {
        this.secondlevel_id = secondlevel_id;
    }

    public Date getCreat_time() {
        return creat_time;
    }

    public void setCreat_time(Date creat_time) {
        this.creat_time = creat_time;
    }

    public boolean isGoods_ishot() {
        return goods_ishot;
    }

    public void setGoods_ishot(boolean goods_ishot) {
        this.goods_ishot = goods_ishot;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(Integer goods_price) {
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
