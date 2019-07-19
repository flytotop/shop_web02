package com.shop.controller;

import com.shop.dto.User;
import com.shop.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
@Api(value = "user" ,description = "用户管理")
public class LoginController {
    @Autowired
    private UserService userService;

@ApiOperation(value = "用户登录")
@ApiImplicitParams({
        @ApiImplicitParam(name = "username", value = "登陆账号",required = false,paramType = "query", dataType = "String"),
        @ApiImplicitParam(name = "password", value = "密码",required = true,paramType = "query", dataType = "String")

})
    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    @ResponseBody
    public User test(HttpSession session,String username,String password){

        User user=userService.login(username,password);
        if (user!=null){
            session.setAttribute("user",user);
        }
        return user;
    }

    @ApiOperation(value = "用户退出")
    @RequestMapping(value = "/logout" , method = RequestMethod.POST)
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

    @ApiOperation(value = "用户注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user_login", value = "登陆账号",required = false,paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "user_name", value = "用户名称、",required = true,paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "user_password", value = "密码",required = false,paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "tel", value = "联系方式",required = false,paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "email_adress", value = "邮箱",required = false,paramType = "query", dataType = "String")

    })
    @RequestMapping(value = "/register" ,method = RequestMethod.POST)
    @ResponseBody
    public String register(User user){
        return userService.registered(user);
    }
}
