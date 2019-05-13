package com.shop.mapper;

import com.shop.dto.First_Levels;
import com.shop.dto.Second_Levels;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LevelsMapper {
    List<First_Levels> getfirstlevel();
   //获得一级目录下的二级目录
    List<Second_Levels> geseoncdlevels(@Param("id") Integer firstlevel_id);

}
