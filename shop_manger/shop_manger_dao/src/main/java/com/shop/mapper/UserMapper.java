package com.shop.mapper;

import com.shop.dto.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User login(@Param("user_login") String login,@Param("user_password") String password);
    void registered(User user);
}
