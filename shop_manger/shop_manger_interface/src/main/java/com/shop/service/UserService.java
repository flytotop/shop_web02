package com.shop.service;

import com.shop.dto.User;

public interface UserService {
    //用户登录
    User login(String user_login,String user_password);
    String registered(User user);
}
