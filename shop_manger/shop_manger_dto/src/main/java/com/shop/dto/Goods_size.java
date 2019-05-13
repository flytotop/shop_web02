package com.shop.dto;

import java.io.Serializable;

public class Goods_size  implements Serializable {
    private Integer size_id;
    private String size_name;
    private String size_num;

    public Goods_size(Integer size_id, String size_name, String size_num) {
        this.size_id = size_id;
        this.size_name = size_name;
        this.size_num = size_num;
    }

    public Goods_size() {
    }

    public Integer getSize_id() {
        return size_id;
    }

    public void setSize_id(Integer size_id) {
        this.size_id = size_id;
    }

    public String getSize_name() {
        return size_name;
    }

    public void setSize_name(String size_name) {
        this.size_name = size_name;
    }

    public String getSize_num() {
        return size_num;
    }

    public void setSize_num(String size_num) {
        this.size_num = size_num;
    }
}
