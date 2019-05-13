package com.shop.service;

import com.shop.dto.Receive_adress;

import java.util.List;

public interface ReceiveAdressService {
    //添加收货地址
    String addreceiveadress(Receive_adress receive_adress);
    //修改收货地址
    String changgereceiveadress(Receive_adress receive_adress);
    //删除收货地址
    String delreceiveadress(Integer receiveid);
    //查看收货地址
    List<Receive_adress> getreceive_adress(Integer userid);
}
