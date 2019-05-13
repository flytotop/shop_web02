package com.shop.service;

import com.shop.dto.Goods;

import java.util.List;

public interface GoodsService {
    //通过名称查找商品
    List<Goods> getgoodsby_name(String name);
    //点击图片获得的商品
    List<Goods> getgoodsby_goodsid(Integer goodsid);
    //一级目录下的所有商品
    List getgoodsby_firstlevelid(Integer firstlevel_id);
    //二级目录下的所有商品
    List<Goods> getgoodsby_secondlevelid(Integer secondlevel_id);
    //最新商品
    List<Goods> getgoodsby_creattime(boolean ismain );
    //热门商品
    List<Goods> getgoodsby_ishot(boolean ismain);
}
