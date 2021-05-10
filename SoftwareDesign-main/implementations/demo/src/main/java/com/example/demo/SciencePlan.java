package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

public class SciencePlan {

    @Id
    private Integer id;
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String sciplan_Name;
    private String creator;
    private String objective;
    private Integer funding;
    private String star_system;
    private String schedule_start;
    private String schedule_end;
    private String telescope_location;
    private String filetype;
    private Integer filequality;
    private String colortype;
    private Integer colors;
    private Integer contrast;
    private Integer brightness;
    private Integer saturation;

    public SciencePlan() {
        this.sciplan_Name = sciplan_Name;
        this.creator = creator;
        this.objective = objective;
        this.funding = funding;
        this.star_system = star_system;
        this.schedule_start = schedule_start;
        this.schedule_end = schedule_end;
        this.telescope_location = telescope_location;
        this.filetype = filetype;
        this.filequality = filequality;
        this.colortype = colortype;
        this.colors = colors;
        this.contrast = contrast;
        this.brightness = brightness;
        this.saturation = saturation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSciplan_Name() {
        return sciplan_Name;
    }

    public void setSciplan_Name(String sciplan_Name) {
        this.sciplan_Name = sciplan_Name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public Integer getFunding() {
        return funding;
    }

    public void setFunding(Integer funding) {
        this.funding = funding;
    }

    public String getStar_system() {
        return star_system;
    }

    public void setStar_system(String star_system) {
        this.star_system = star_system;
    }

    public String getSchedule_start() {
        return schedule_start;
    }

    public void setSchedule_start(String schedule_start) {
        this.schedule_start = schedule_start;
    }

    public String getSchedule_end() {
        return schedule_end;
    }

    public void setSchedule_end(String schedule_end) {
        this.schedule_end = schedule_end;
    }

    public String getTelescope_location() {
        return telescope_location;
    }

    public void setTelescope_location(String telescope_location) {
        this.telescope_location = telescope_location;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public Integer getFilequality() {
        return filequality;
    }

    public void setFilequality(Integer filequality) {
        this.filequality = filequality;
    }

    public String getColortype() {
        return colortype;
    }

    public void setColortype(String colortype) {
        this.colortype = colortype;
    }

    public Integer getColors() {
        return colors;
    }

    public void setColors(Integer colors) {
        this.colors = colors;
    }

    public Integer getContrast() {
        return contrast;
    }

    public void setContrast(Integer contrast) {
        this.contrast = contrast;
    }

    public Integer getBrightness() {
        return brightness;
    }

    public void setBrightness(Integer brightness) {
        this.brightness = brightness;
    }

    public Integer getSaturation() {
        return saturation;
    }

    public void setSaturation(Integer saturation) {
        this.saturation = saturation;
    }


}
