package com.shop.utils;

import java.text.SimpleDateFormat;

public class DatatoString {
    public static String datatoString(){
        java.util.Date utilDate=new java.util.Date();
        utilDate.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String data=sdf.format(utilDate);
        return data;
    }
}
