package com.shop.mapper;

import com.shop.dto.Goods;
import com.shop.dto.Shop_pergoods_msg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {

    //查看二级目录下的商品
    List<Goods> getgoodsby_secondlevel(@Param("id")   Integer secondlevelid);
    //通过名称查询商品
    List<Goods> getgoodsby_name(@Param("name") String name);
    //通过点击图片获得商品
    List<Goods> getgoodsby_gooodsid(@Param("id") Integer goodsid);
    //获得最近上架的商品
    List<Goods> getgoodsby_creattime(@Param("result") boolean result);
    //获得热门商品
    List<Goods> getgoodsby_ishot(@Param("result") boolean result);
}
