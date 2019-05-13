package com.shop.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
    public static String getMD5(String str){
        try {
            MessageDigest messageDigest=MessageDigest.getInstance("MD5");
            byte inputarry[]=str.getBytes();
            messageDigest.update(inputarry);
            byte resultarry[]=messageDigest.digest();
            return bytearrytoHex(resultarry);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    private static String bytearrytoHex(byte resultarry[]){
        char[] hexDigits = {'0','1','2','3','4','5','6','7','8','9', 'A','B','C','D','E','F' };
        char resultarrytochar[]=new char[resultarry.length*2];
        int index=0;
        for (byte b:resultarry){
            resultarrytochar[index++] = hexDigits[b>>> 4 & 0xf];

            resultarrytochar[index++] = hexDigits[b& 0xf];
        }
        return new String(resultarrytochar);
    }
}
