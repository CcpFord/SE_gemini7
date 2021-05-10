package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class DataRequirements {

    @Id
    private Integer id;
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String filetype;
    private int filequality;
    private String colortype;
    private int colors;
    private int constrast;
    private int brightness;
    private int saturation;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public int getFilequality() {
        return filequality;
    }

    public void setFilequality(int filequality) {
        this.filequality = filequality;
    }

    public String getColortype() {
        return colortype;
    }

    public void setColortype(String colortype) {
        this.colortype = colortype;
    }

    public int getColors() {
        return colors;
    }

    public void setColors(int colors) {
        this.colors = colors;
    }

    public int getConstrast() {
        return constrast;
    }

    public void setConstrast(int constrast) {
        this.constrast = constrast;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getSaturation() {
        return saturation;
    }

    public void setSaturation(int saturation) {
        this.saturation = saturation;
    }
}
