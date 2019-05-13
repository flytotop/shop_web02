package com.shop.controller;

import com.shop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    //通过商品名称查询商品
    @RequestMapping("/getgoodsby_name" )
    @ResponseBody
    public List getgoodsby_name(String name){
        List goods=goodsService.getgoodsby_name("冬装");
        return goods;
    }
    //通过点击图片查询商品

    @RequestMapping("/getgoodsby_goodsid")
    @ResponseBody
    public List getgoodsby_goodsid(Integer goodsid){
        return goodsService.getgoodsby_goodsid(goodsid);
    }

    //通过点击一级目录获得商品
    @RequestMapping("/getgoodsby_firstlevelid")
    @ResponseBody
    public List getgoodsby_firstlevelid(Integer firstlevelid){
        return goodsService.getgoodsby_firstlevelid(firstlevelid);
    }

    //通过点击二级目录获得商品
    @RequestMapping("/getgoodsby_secondlevelid")
    @ResponseBody
    public List getgoodsby_secondlevelid(Integer secondlevelid){
        return goodsService.getgoodsby_secondlevelid(secondlevelid);
    }
}
