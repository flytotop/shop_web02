package com.shop.dto;

import java.io.Serializable;
import java.util.List;

public class First_Levels implements Serializable {
    private Integer first_levels_id;
    private String first_level_name;
    private List<Second_Levels> second_levels;
    public First_Levels(){}
    public First_Levels(Integer first_levels_id,String first_level_name,List<Second_Levels> second_levels){
        this.first_levels_id=first_levels_id;
        this.first_level_name=first_level_name;
        this.second_levels=second_levels;
    }

    public Integer getFirst_levels_id() {
        return first_levels_id;
    }

    public void setFirst_levels_id(Integer first_levels_id) {
        this.first_levels_id = first_levels_id;
    }

    public String getFirst_level_name() {
        return first_level_name;
    }

    public void setFirst_level_name(String first_level_name) {
        this.first_level_name = first_level_name;
    }

    public List<Second_Levels> getSecond_levels() {
        return second_levels;
    }

    public void setSecond_levels(List<Second_Levels> second_levels) {
        this.second_levels = second_levels;
    }
}
