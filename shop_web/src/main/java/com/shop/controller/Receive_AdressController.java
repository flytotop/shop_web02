package com.shop.controller;

import com.shop.dto.Receive_adress;
import com.shop.dto.User;
import com.shop.service.ReceiveAdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("receiveadress")
public class Receive_AdressController {
    @Autowired
    private ReceiveAdressService receiveAdressService;

    //添加收货地址
    @RequestMapping("/addreceiveadress")
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

    //删除收货地址
    @RequestMapping("/delreceiveadress")
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
    @RequestMapping("/updatareceiveadress")
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
    @RequestMapping("/getallreceiveadress")
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
