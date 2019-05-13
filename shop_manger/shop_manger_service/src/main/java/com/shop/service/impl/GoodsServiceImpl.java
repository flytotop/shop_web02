package com.shop.service.impl;

import com.shop.dto.Goods;
import com.shop.dto.Second_Levels;
import com.shop.mapper.GoodsMapper;
import com.shop.mapper.LevelsMapper;
import com.shop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private LevelsMapper levelsMapper;

    @Override
    public List<Goods> getgoodsby_name(String name) {
        List<Goods> goods=goodsMapper.getgoodsby_name("'%"+name+"%'");
        return goods;
    }

    @Override
    public List<Goods> getgoodsby_goodsid(Integer goodsid) {
        List<Goods> goods=goodsMapper.getgoodsby_gooodsid(goodsid);
        return goods;
    }

    @Override
    public List getgoodsby_firstlevelid(Integer firstlevel_id) {
        List<Second_Levels> second_levels=levelsMapper.geseoncdlevels(firstlevel_id);
        List goods=new ArrayList();
        for (Second_Levels second_levels1:second_levels){
            goods.add(goodsMapper.getgoodsby_secondlevel(second_levels1.getsecondlevel_id()));
        }
        return goods;
    }

    @Override
    public List<Goods> getgoodsby_secondlevelid(Integer secondlevel_id) {
        return goodsMapper.getgoodsby_secondlevel(secondlevel_id);
    }

    @Override
    public List<Goods> getgoodsby_creattime(boolean ismain) {
        return goodsMapper.getgoodsby_creattime(ismain);
    }

    @Override
    public List<Goods> getgoodsby_ishot(boolean ismain) {
        return goodsMapper.getgoodsby_ishot(ismain);
    }
}
