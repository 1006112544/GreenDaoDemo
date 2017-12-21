package com.daobao.asus.greendaodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.daobao.asus.greendaodemo.greendao.Sport;
import com.daobao.asus.greendaodemo.greendao.SportDao;
import com.daobao.asus.greendaodemo.greendao.dayStep;
import com.daobao.asus.greendaodemo.greendao.dayStepDao;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private  dayStepDao dayStepDao ;
    private SportDao mSportDao;
    private dayStep mDayStep;
    private Sport mSport;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dayStepDao = MyApplication.getInstances().getDaoSession().getDayStepDao();
        insert();
        Search();

        mSportDao = MyApplication.getInstances().getDaoSession().getSportDao();
        //运动表添加及查找
        String date = new Date().toString();
        mSport = new Sport(null,0,date,0);
        mSportDao.insert(mSport);

        List<Sport> mSports = mSportDao.queryBuilder().listLazy();
        for (int i = 0; i < mSports.size(); i++) {
            String str = "";
            str = mSports.get(i).getTime();
            Log.d("cc", "Sport    id:  "+i+"date:  "+str);
        }

    }

    /**
     * 增
     */
    public void insert()
    {
        String date = new Date().toString();
        mDayStep = new dayStep(null,date,0);
        dayStepDao.insert(mDayStep);
    }

    /**
     * 查
     */
    public void Search()
    {
        //方法一
        List<dayStep> mDayStep = dayStepDao.loadAll();
        //方法二
        //List<dayStep> mDayStep = dao.queryBuilder().list();
        //方法三 惰性加载
        //List<dayStep> mDayStep = dao.queryBuilder().listLazy();
        for (int i = 0; i < mDayStep.size(); i++) {
            String date = "";
            date = mDayStep.get(i).getDate();
            Log.d("cc", "id:  "+i+"date:  "+date);
        }

    }

    /**
     * 删
     * @param i 删除数据的id
     */
    public void delete(long i)
    {
        dayStepDao.deleteByKey(i);
    }

    /**
     *改
     * @param i
     * @param date
     */
    public void correct(long i,String date)
    {
        mDayStep =  new dayStep((long) i,date,0);
        dayStepDao.update(mDayStep);
    }

}
