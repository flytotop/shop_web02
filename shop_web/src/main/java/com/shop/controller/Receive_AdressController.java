package com.shop.controller;

import com.shop.dto.Receive_adress;
import com.shop.dto.User;
import com.shop.service.ReceiveAdressService;
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
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("receiveadress")
@Api(value = "receiveadress" ,description = "收货地址管理")
public class Receive_AdressController {
    @Autowired
    private ReceiveAdressService receiveAdressService;

    //添加收货地址
    @ApiOperation(value = "添加收货地址" )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "tel", value = "联系方式", required = false, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "adress", value = "收货人地址", required = false, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "receive_user", value = "收货人名称", required = false, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "order_forshow", value = "输入收货地址d", required = false, paramType = "query", dataType = "Order_forshow"),

    } )
    @RequestMapping(value = "/addreceiveadress" ,method = RequestMethod.POST)
    @ResponseBody
    public String addreceiveadress(HttpSession session, Receive_adress adress){
        User user=(User)session.getAttribute("user");
        if (user==null){
          return "nouser";
        }else {
            adress.setUser_id(user.getUser_id());
            return receiveAdressService.addreceiveadress(adress);
        }
    }

    @ApiOperation(value = "删除收货地址" )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "receiveadressid", value = "收货地址id", required = false, paramType = "query", dataType = "Integer")

    } )
    //删除收货地址
    @RequestMapping(value = "/delreceiveadress",method = RequestMethod.POST)
    @ResponseBody
    private String delreceiveadress(HttpSession session,Integer receiveadressid){
        User user=(User)session.getAttribute("user");
        if (user==null){
            return "nouser";
        }else {
            return receiveAdressService.delreceiveadress(receiveadressid);
        }
    }

    //修改收货地址
    @ApiOperation(value = "修改收货地址" )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "tel", value = "联系方式", required = false, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "adress", value = "收货人地址", required = false, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "receive_user", value = "收货人名称", required = false, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "receive_id", value = "收货地址d", required = false, paramType = "query", dataType = "Order_forshow"),

    } )
    @RequestMapping(value = "/updatareceiveadress",method = RequestMethod.POST)
    @ResponseBody
    public String updatareceiveadress(HttpSession session, Receive_adress adress){
        User user=(User)session.getAttribute("user");
        if (user==null){
            return "nouser";
        }else {
            adress.setUser_id(user.getUser_id());
            return receiveAdressService.changgereceiveadress(adress);
        }
    }

    //查看收货地址
    @ApiOperation(value = "查看收货地址" )
    @RequestMapping(value = "/getallreceiveadress" ,method = RequestMethod.POST)
    @ResponseBody
    public List getallreceiveadress(HttpSession session){
        User user=(User)session.getAttribute("user");
        if (user==null){
            List res=new ArrayList();
            res.add("nouser");
            return res;
        }else {
            return receiveAdressService.getreceive_adress(user.getUser_id());
        }
    }
}
