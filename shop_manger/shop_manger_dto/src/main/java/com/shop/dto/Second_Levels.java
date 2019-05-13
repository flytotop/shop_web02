package com.shop.dto;

import java.io.Serializable;

public class Second_Levels  implements Serializable {
    private Integer secondlevel_id;
    private Integer first_levels_id;
    private String secondlevel_name;
    public Second_Levels(){}
    public Second_Levels(Integer secondlevel_id,Integer first_levels_id,String secondlevel_name){
        this.secondlevel_id=secondlevel_id;
        this.first_levels_id=first_levels_id;
        this.secondlevel_name=secondlevel_name;
    }
    public Integer getsecondlevel_id() {
        return secondlevel_id;
    }

    public void setsecondlevel_id(Integer secondlevel_id) {
        this.secondlevel_id = secondlevel_id;
    }

    public Integer getFirst_levels_id() {
        return first_levels_id;
    }

    public void setFirst_levels_id(Integer first_levels_id) {
        this.first_levels_id = first_levels_id;
    }

    public String getsecondlevel_name() {
        return secondlevel_name;
    }

    public void setsecondlevel_name(String secondlevel_name) {
        this.secondlevel_name = secondlevel_name;
    }
}
