package com.bsoft.hs.common;

import android.app.Application;
import android.content.Context;

/**
 * Created by 泅渡者
 * Created on 2017/3/22.
 *
 */
public class MyApplication extends Application {

    private static MyApplication instance;
    public static Context myContext;

    public static MyApplication getInstance() {
        return instance;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        myContext = this.getApplicationContext();
    }
}
