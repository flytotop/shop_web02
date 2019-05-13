package com.shop.service.impl;

import com.shop.dto.User;
import com.shop.mapper.UserMapper;

import com.shop.service.UserService;
import com.shop.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String user_login, String pass_word) {
        String password=MD5Util.getMD5(pass_word);
        User user=userMapper.login(user_login,password);
        return user;
    }

@Transactional
    @Override
    public String registered(User user) {
        String code;
        try {
            String user_password=user.getUser_password();
            user.setUser_password(MD5Util.getMD5(user_password));
            userMapper.registered(user);
            code="true";
        }catch (Exception e){
            e.printStackTrace();
            code="false";
        }
      return code;
    }
}
