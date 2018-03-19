package com.daobao.asus.greendaodemo.greendao;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.ToOne;

/**
 * Created by db on 2018/1/3.
 */
@Entity
public class SportInfo {
    @Id
    private Long sportId;
    //日期
    private String date = "";
    /**
     * 建议类型
     *1：步数 < 10000步，无运动
     *2：步数 < 10000步，有运动
     *3：步数 > 10000步，无运动
     *4：步数 > 10000步，有运动
     */
    private int type;
    //建议内容
    private String content ="";
    //步数
    private int step_count = 0;
    //总距离
    private float distance = 0;
    //运动次数
    private int Sport_number = 0;
    //运动累计总距离
    private float Sport_distance = 0;
    //上传记录  是否上传
    private boolean update_time = false;
    private Long UserId;
    @ToOne(joinProperty = "UserId")
    private UserInfo userInfo;//关系表
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 294877999)
    private transient SportInfoDao myDao;
    @Generated(hash = 2066097151)
    private transient Long userInfo__resolvedKey;
    @Generated(hash = 605708405)
    public SportInfo(Long sportId, String date, int type, String content,
            int step_count, float distance, int Sport_number, float Sport_distance,
            boolean update_time, Long UserId) {
        this.sportId = sportId;
        this.date = date;
        this.type = type;
        this.content = content;
        this.step_count = step_count;
        this.distance = distance;
        this.Sport_number = Sport_number;
        this.Sport_distance = Sport_distance;
        this.update_time = update_time;
        this.UserId = UserId;
    }
    @Generated(hash = 1254911132)
    public SportInfo() {
    }
    public Long getSportId() {
        return this.sportId;
    }
    public void setSportId(Long sportId) {
        this.sportId = sportId;
    }
    public String getDate() {
        return this.date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public int getType() {
        return this.type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public int getStep_count() {
        return this.step_count;
    }
    public void setStep_count(int step_count) {
        this.step_count = step_count;
    }
    public float getDistance() {
        return this.distance;
    }
    public void setDistance(float distance) {
        this.distance = distance;
    }
    public int getSport_number() {
        return this.Sport_number;
    }
    public void setSport_number(int Sport_number) {
        this.Sport_number = Sport_number;
    }
    public float getSport_distance() {
        return this.Sport_distance;
    }
    public void setSport_distance(float Sport_distance) {
        this.Sport_distance = Sport_distance;
    }
    public boolean getUpdate_time() {
        return this.update_time;
    }
    public void setUpdate_time(boolean update_time) {
        this.update_time = update_time;
    }
    public Long getUserId() {
        return this.UserId;
    }
    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }
    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1871252209)
    public UserInfo getUserInfo() {
        Long __key = this.UserId;
        if (userInfo__resolvedKey == null || !userInfo__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            UserInfoDao targetDao = daoSession.getUserInfoDao();
            UserInfo userInfoNew = targetDao.load(__key);
            synchronized (this) {
                userInfo = userInfoNew;
                userInfo__resolvedKey = __key;
            }
        }
        return userInfo;
    }
    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 734619330)
    public void setUserInfo(UserInfo userInfo) {
        synchronized (this) {
            this.userInfo = userInfo;
            UserId = userInfo == null ? null : userInfo.getId();
            userInfo__resolvedKey = UserId;
        }
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }
    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 570744676)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getSportInfoDao() : null;
    }


}
