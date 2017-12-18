package com.daobao.asus.greendaodemo.greendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by db on 2017/12/18.
 */
@Entity
public class dayStep {
    @Id
    private Long id;
    private String date;
    private int step;
    @Generated(hash = 966380930)
    public dayStep(Long id, String date, int step) {
        this.id = id;
        this.date = date;
        this.step = step;
    }
    @Generated(hash = 1348095957)
    public dayStep() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDate() {
        return this.date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public int getStep() {
        return this.step;
    }
    public void setStep(int step) {
        this.step = step;
    }
}
