package com.shop.service.impl;

import com.shop.dto.Receive_adress;
import com.shop.mapper.AdressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReceiveAdressServiceImpl implements com.shop.service.ReceiveAdressService {
    @Autowired
    private AdressMapper adressMapper;

    @Override
    public String addreceiveadress(Receive_adress receive_adress) {
        try {
            adressMapper.addreciveadress(receive_adress);
            return "true";
        }catch (Exception e){
            e.printStackTrace();
            return "false";
        }
    }

    @Override
    public String changgereceiveadress(Receive_adress receive_adress) {
        try {
            adressMapper.updatareciveadress(receive_adress);
            return "true";
        }catch (Exception e){
            e.printStackTrace();
            return "false";
        }
    }

    @Override
    public String delreceiveadress(Integer receiveid) {
        try {
            adressMapper.delreciveadress(receiveid);
            return "true";
        }catch (Exception e){
            e.printStackTrace();
            return "false";
        }
    }

    @Override
    public List<Receive_adress> getreceive_adress(Integer userid) {


       List<Receive_adress> receive_adresses=adressMapper.getreciveadress(userid);

        return receive_adresses;
    }
}
