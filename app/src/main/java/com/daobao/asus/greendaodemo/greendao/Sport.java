package com.daobao.asus.greendaodemo.greendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by db on 2017/12/21.
 */
@Entity
public class Sport {
    @Id
    private Long id;
    private int distance;
    private String time;
    private int  calorie;
    @Generated(hash = 1720810658)
    public Sport(Long id, int distance, String time, int calorie) {
        this.id = id;
        this.distance = distance;
        this.time = time;
        this.calorie = calorie;
    }
    @Generated(hash = 2004282459)
    public Sport() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getDistance() {
        return this.distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    public String getTime() {
        return this.time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public int getCalorie() {
        return this.calorie;
    }
    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }
}
