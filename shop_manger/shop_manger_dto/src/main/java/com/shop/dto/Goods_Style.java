package com.shop.dto;

import java.io.Serializable;
import java.util.List;

public class Goods_Style  implements Serializable {
    private   Integer style_id;
    private String style_name;
    private List<Goods_size> goods_sizes;

    public Goods_Style() {
    }

    public Goods_Style(Integer style_id, String style_name, List<Goods_size> goods_sizes) {
        this.style_id = style_id;
        this.style_name = style_name;
        this.goods_sizes = goods_sizes;
    }

    public Integer getStyle_id() {
        return style_id;
    }

    public void setStyle_id(Integer style_id) {
        this.style_id = style_id;
    }

    public String getStyle_name() {
        return style_name;
    }

    public void setStyle_name(String style_name) {
        this.style_name = style_name;
    }

    public List<Goods_size> getGoods_sizes() {
        return goods_sizes;
    }

    public void setGoods_sizes(List<Goods_size> goods_sizes) {
        this.goods_sizes = goods_sizes;
    }
}
