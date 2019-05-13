package com.shop.dto;

import java.io.Serializable;

public class Order  implements Serializable {
    private Integer order_id;
    private Integer receiver_id;
    private Integer user_id;

    public Order(){}
    public Order(Integer order_id,Integer receiver_id,Integer user_id){
        this.order_id=order_id;
        this.receiver_id=receiver_id;
        this.user_id=user_id;
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
}
