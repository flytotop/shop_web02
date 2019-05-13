package com.shop.dto;

import java.io.Serializable;
import java.util.List;

public class Order_forshow  implements Serializable {
    private Integer order_id;
    private Integer receiver_id;
    private Integer user_id;
    private String creattime;
    private List<Shop_pergoods_msg> shop_pergoods_msgs;

    public Order_forshow() {
    }

    public Order_forshow(Integer order_id, Integer receiver_id, Integer user_id, String creattime, List<Shop_pergoods_msg> shop_pergoods_msgs) {
        this.order_id = order_id;
        this.receiver_id = receiver_id;
        this.user_id = user_id;
        this.creattime = creattime;
        this.shop_pergoods_msgs = shop_pergoods_msgs;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getReceiver_id() {
        return receiver_id;
    }

    public void setReceiver_id(Integer receiver_id) {
        this.receiver_id = receiver_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getCreattime() {
        return creattime;
    }

    public void setCreattime(String creattime) {
        this.creattime = creattime;
    }

    public List<Shop_pergoods_msg> getShop_pergoods_msgs() {
        return shop_pergoods_msgs;
    }

    public void setShop_pergoods_msgs(List<Shop_pergoods_msg> shop_pergoods_msgs) {
        this.shop_pergoods_msgs = shop_pergoods_msgs;
    }
}
