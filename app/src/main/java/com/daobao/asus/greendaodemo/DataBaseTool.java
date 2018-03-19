package com.daobao.asus.greendaodemo;


import com.daobao.asus.greendaodemo.greendao.SportInfo;
import com.daobao.asus.greendaodemo.greendao.SportInfoDao;
import com.daobao.asus.greendaodemo.greendao.UserInfo;
import com.daobao.asus.greendaodemo.greendao.UserInfoDao;

import java.util.List;

/**
 * Created by db on 2018/1/4.
 */

public class DataBaseTool {

    private static SportInfoDao mSportInfoDao = MyApplication.getInstances().getDaoSession().getSportInfoDao();
    private static UserInfoDao mUserInfoDao = MyApplication.getInstances().getDaoSession().getUserInfoDao();
    /**
     * 增加运动信息
     */
    public static long insertSportInfo(UserInfo userInfo, SportInfo sportInfo)
    {
        sportInfo.setUserId(userInfo.getId());
        sportInfo.setUserInfo(userInfo);
        return mSportInfoDao.insertOrReplace(sportInfo);
    }
    /**
     * 增加用户信息
     */
    public static long insertUserInfo(UserInfo info)
    {
        return mUserInfoDao.insertOrReplace(info);
    }

    /**
     * 查运动信息
     */
    public static List<SportInfo> SearchSportInfo(UserInfo userInfo)
    {
        return userInfo.getSportInfo();
    }

    /**
     * 查用户信息
     */
    public static List<UserInfo> SearchUserInfo()
    {
        //惰性加载
        List<UserInfo> list = mUserInfoDao.queryBuilder().listLazy();
        return list;
    }

    /**
     * 删除某条用户信息
     * @param i 删除数据的id
     */
    public static void deleteUserInfo(long i)
    {
        mUserInfoDao.deleteByKey(i);
        //当然Greendao还提供了其他的删除方法，只是传值不同而已
    }

    /**
     *修改某条运动信息
     */
    public static void correctSportInfo(SportInfo info)
    {
        mSportInfoDao.update(info);
    }

    /**
     *修改某条用户信息
     */
    public static void correctUserInfo(UserInfo info)
    {
        mUserInfoDao.update(info);
    }
}


