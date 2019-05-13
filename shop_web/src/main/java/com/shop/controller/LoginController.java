package com.shop.controller;

import com.shop.dto.User;
import com.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class LoginController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    @ResponseBody
    public User test(HttpSession session,String username,String password){
        User user=userService.login(username,password);
        if (user!=null){
            session.setAttribute("user",user);
        }
        return user;
    }
    @RequestMapping("/logout")
    @ResponseBody
    public String logout(HttpSession session){
        User user=(User) session.getAttribute("user");
        if (null!=user){
            session.removeAttribute("user");
            return "true";
        }else {
            return "false";
        }
    }
    @RequestMapping("/register")
    @ResponseBody
    public String register(User user){
        return userService.registered(user);
    }
}
