package com.shop.dto;

import java.io.Serializable;

public class User  implements Serializable {
    private  Integer user_id;
    private String user_login;
    private String user_name;

    public String getUser_login() {
        return user_login;
    }

    public void setUser_login(String user_login) {
        this.user_login = user_login;
    }

    private String user_password;
    private String tel;
    private String email_adress;
    public User(){}
    public User(Integer user_id,String user_login,String user_name,String user_password,String tel,String email_adress){
        this.user_id=user_id;
        this.user_login=user_login;
        this.user_name=user_name;
        this.user_password=user_password;
        this.tel=tel;
        this.email_adress=email_adress;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail_adress() {
        return email_adress;
    }

    public void setEmail_adress(String email_adress) {
        this.email_adress = email_adress;
    }
}
