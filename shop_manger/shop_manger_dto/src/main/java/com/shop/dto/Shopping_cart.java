package com.shop.dto;

import java.io.Serializable;

public class Shopping_cart  implements Serializable {
    private Integer shopping_id;
    private Integer user_id;
    private String picture_adress;
    private Integer shopping_cart_id;
    public Shopping_cart(){}

    public Shopping_cart(Integer shopping_id, Integer user_id, String picture_adress, Integer shopping_cart_id) {
        this.shopping_id = shopping_id;
        this.user_id = user_id;
        this.picture_adress = picture_adress;
        this.shopping_cart_id = shopping_cart_id;
    }

    public Integer getShopping_cart_id() {
        return shopping_cart_id;
    }

    public void setShopping_cart_id(Integer shopping_cart_id) {
        this.shopping_cart_id = shopping_cart_id;
    }

    public Integer getShopping_id() {
        return shopping_id;
    }

    public void setShopping_id(Integer shopping_id) {
        this.shopping_id = shopping_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getPicture_adress() {
        return picture_adress;
    }

    public void setPicture_adress(String picture_adress) {
        this.picture_adress = picture_adress;
    }
}
