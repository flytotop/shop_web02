package com.shop.dto;

import java.io.Serializable;

public class Receive_adress  implements Serializable {
    private Integer receive_id;
    private Integer user_id;
    private String tel;
    private String adress;
    private String receive_user;
    public Receive_adress(){}
    public Receive_adress(Integer receive_id,Integer user_id,String tel,String adress,String receive_user){
        this.receive_id=receive_id;
        this.user_id=user_id;
        this.tel=tel;
        this.adress=adress;
        this.receive_user=receive_user;
    }

    public Integer getReceive_id() {
        return receive_id;
    }

    public void setReceive_id(Integer receive_id) {
        this.receive_id = receive_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getReceive_user() {
        return receive_user;
    }

    public void setReceive_user(String receive_user) {
        this.receive_user = receive_user;
    }
}
