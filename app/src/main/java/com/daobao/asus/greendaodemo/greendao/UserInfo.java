package com.daobao.asus.greendaodemo.greendao;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.ToMany;

import java.util.List;

/**
 * Created by db on 2018/1/3.
 */
@Entity
public class UserInfo {
    @Id
    private Long id;
    //账号
    private String number;
    //密码
    private String password;
    //昵称
    private String nick_name;
    //性别（0：男 1：女 2：其他）
    private int sex;//性别（0：男 1：女 2：其他）
    //身高
    private float height;
    //体重
    private float weight;
    //出生日期
    private String birthday;
    //自定义头像（文件id，外键）
    private String photo_link;
    //运动目标（步）
    private int sport_goal;
    //总概述
    private String summarize;
    //一对多关联
    @ToMany(referencedJoinProperty = "sportId")
    private List<SportInfo> sportInfo;
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 437952339)
    private transient UserInfoDao myDao;
    @Generated(hash = 51712116)
    public UserInfo(Long id, String number, String password, String nick_name,
            int sex, float height, float weight, String birthday, String photo_link,
            int sport_goal, String summarize) {
        this.id = id;
        this.number = number;
        this.password = password;
        this.nick_name = nick_name;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.birthday = birthday;
        this.photo_link = photo_link;
        this.sport_goal = sport_goal;
        this.summarize = summarize;
    }
    @Generated(hash = 1279772520)
    public UserInfo() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNumber() {
        return this.number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNick_name() {
        return this.nick_name;
    }
    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }
    public int getSex() {
        return this.sex;
    }
    public void setSex(int sex) {
        this.sex = sex;
    }
    public float getHeight() {
        return this.height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getWeight() {
        return this.weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public String getBirthday() {
        return this.birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getPhoto_link() {
        return this.photo_link;
    }
    public void setPhoto_link(String photo_link) {
        this.photo_link = photo_link;
    }
    public int getSport_goal()  {
        return this.sport_goal;
    }
    public void setSport_goal(int sport_goal) {
        this.sport_goal = sport_goal;
    }
    public String getSummarize() {
        return this.summarize;
    }
    public void setSummarize(String summarize) {
        this.summarize = summarize;
    }
    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 1378656076)
    public List<SportInfo> getSportInfo() {
        if (sportInfo == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            SportInfoDao targetDao = daoSession.getSportInfoDao();
            List<SportInfo> sportInfoNew = targetDao._queryUserInfo_SportInfo(id);
            synchronized (this) {
                if (sportInfo == null) {
                    sportInfo = sportInfoNew;
                }
            }
        }
        return sportInfo;
    }
    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 683486721)
    public synchronized void resetSportInfo() {
        sportInfo = null;
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
    @Generated(hash = 821180768)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getUserInfoDao() : null;
    }
  

}