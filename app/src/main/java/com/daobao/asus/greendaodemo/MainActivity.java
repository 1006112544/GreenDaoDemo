package com.daobao.asus.greendaodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.daobao.asus.greendaodemo.greendao.SportInfo;
import com.daobao.asus.greendaodemo.greendao.UserInfo;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserInfo userInfo = new UserInfo();
        userInfo.setNick_name("111");
        DataBaseTool.insertUserInfo(userInfo);
        SportInfo sportInfo = new SportInfo();
        DataBaseTool.insertSportInfo(userInfo,sportInfo);
        List<SportInfo> list = DataBaseTool.SearchSportInfo(userInfo);
        for (SportInfo mSport:list)
        {
            Log.d("cc", "onCreate: "+mSport.getSportId());
        }
        Log.d("111", "onCreate: "+sportInfo.getUserInfo());
    }

}
