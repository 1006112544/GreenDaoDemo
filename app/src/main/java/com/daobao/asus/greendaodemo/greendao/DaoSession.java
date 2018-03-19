package com.daobao.asus.greendaodemo.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.daobao.asus.greendaodemo.greendao.SportInfo;
import com.daobao.asus.greendaodemo.greendao.UserInfo;

import com.daobao.asus.greendaodemo.greendao.SportInfoDao;
import com.daobao.asus.greendaodemo.greendao.UserInfoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig sportInfoDaoConfig;
    private final DaoConfig userInfoDaoConfig;

    private final SportInfoDao sportInfoDao;
    private final UserInfoDao userInfoDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        sportInfoDaoConfig = daoConfigMap.get(SportInfoDao.class).clone();
        sportInfoDaoConfig.initIdentityScope(type);

        userInfoDaoConfig = daoConfigMap.get(UserInfoDao.class).clone();
        userInfoDaoConfig.initIdentityScope(type);

        sportInfoDao = new SportInfoDao(sportInfoDaoConfig, this);
        userInfoDao = new UserInfoDao(userInfoDaoConfig, this);

        registerDao(SportInfo.class, sportInfoDao);
        registerDao(UserInfo.class, userInfoDao);
    }
    
    public void clear() {
        sportInfoDaoConfig.clearIdentityScope();
        userInfoDaoConfig.clearIdentityScope();
    }

    public SportInfoDao getSportInfoDao() {
        return sportInfoDao;
    }

    public UserInfoDao getUserInfoDao() {
        return userInfoDao;
    }

}
