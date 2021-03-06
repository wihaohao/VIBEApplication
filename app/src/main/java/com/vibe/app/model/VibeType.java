package com.vibe.app.model;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import java.io.Serializable;

/**
 * Entity mapped to table "VIBE_TYPE".
 */
public class VibeType implements Serializable {

    private Long _id;
    private String name;
    private Integer mode;
    private Integer time;
    private Integer rate;
    private Boolean selected;

    public VibeType() {
    }

    public VibeType(Long _id) {
        this._id = _id;
    }

    public VibeType(Long _id, String name, Integer mode, Integer time, Integer rate, Boolean selected) {
        this._id = _id;
        this.name = name;
        this.mode = mode;
        this.time = time;
        this.rate = rate;
        this.selected = selected;
    }

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

}
