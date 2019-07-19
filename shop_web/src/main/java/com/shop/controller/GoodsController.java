package com.shop.controller;

import com.shop.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("goods")
@Api(value = "goods" ,description = "商品管理")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @ApiOperation("通过商品名称查询商品")
    @ApiImplicitParams(
            @ApiImplicitParam( name = "name" ,value = "商品名称" ,paramType = "query",required = false,dataType ="String" )
    )
    //通过商品名称查询商品
    @RequestMapping(value = "/getgoodsby_name",method = RequestMethod.POST )
    @ResponseBody
    public List getgoodsby_name(String name){
        List goods=goodsService.getgoodsby_name(name);
        return goods;
    }
    //通过点击图片查询商品
    @ApiOperation("通过点击图片查询商品")
    @ApiImplicitParams(
            @ApiImplicitParam( name = "goodsid" ,value = "商品id" ,paramType = "query",required = false,dataType ="Integer" )
    )
    @RequestMapping(value = "/getgoodsby_goodsid",method = RequestMethod.POST)
    @ResponseBody
    public List getgoodsby_goodsid(Integer goodsid){
        return goodsService.getgoodsby_goodsid(goodsid);
    }

    @ApiOperation("通过点击一级目录获得商品")
    @ApiImplicitParams(
            @ApiImplicitParam( name = "firstlevelid" ,value = "一级目录id",paramType = "query" ,required = false,dataType ="Integer" )
    )
    //通过点击一级目录获得商品
    @RequestMapping(value = "/getgoodsby_firstlevelid",method = RequestMethod.POST )
    @ResponseBody
    public List getgoodsby_firstlevelid(Integer firstlevelid){
        return goodsService.getgoodsby_firstlevelid(firstlevelid);
    }

    @ApiOperation("通过点击二级目录获得商品")
    @ApiImplicitParams(
            @ApiImplicitParam( name = "secondlevelid" ,value = "二级目录id" ,paramType = "query",required = false,dataType ="Integer" )
    )
    //通过点击二级目录获得商品
    @RequestMapping(value = "/getgoodsby_secondlevelid",method = RequestMethod.POST)
    @ResponseBody
    public List getgoodsby_secondlevelid(Integer secondlevelid){
        return goodsService.getgoodsby_secondlevelid(secondlevelid);
    }
}
