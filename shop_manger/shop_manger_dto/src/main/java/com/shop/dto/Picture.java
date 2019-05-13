package com.shop.dto;

import java.io.Serializable;

public class Picture  implements Serializable {
    private Integer pictureid;
    private String pictureurl;

    public Picture(Integer pictureid, String pictureurl) {
        this.pictureid = pictureid;
        this.pictureurl = pictureurl;
    }

    public Integer getPictureid() {

        return pictureid;
    }

    public Picture() {
    }

    public void setPictureid(Integer pictureid) {
        this.pictureid = pictureid;

    }

    public String getPictureurl() {
        return pictureurl;
    }

    public void setPictureurl(String pictureurl) {
        this.pictureurl = pictureurl;
    }
}
