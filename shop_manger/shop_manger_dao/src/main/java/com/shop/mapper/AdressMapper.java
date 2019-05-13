package com.shop.mapper;

import com.shop.dto.Receive_adress;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdressMapper {
    //添加收货地址
    void addreciveadress(Receive_adress receive_adress);
    //修改收货地址
    void updatareciveadress(Receive_adress receive_adress);
    //删除收货地址
    void delreciveadress(@Param("id") Integer receiveid);
    //查看收货地址
    List<Receive_adress> getreciveadress(@Param("id") Integer userid);
}
