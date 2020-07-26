package com.liqun.chapter02;

import android.app.Application;
import android.os.Process;
import android.util.Log;

import com.liqun.chapter02.utils.MyUtils;

public class MyApplication extends Application {
    private static final String TAG = MyApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        String processName = MyUtils.getProcessName(getApplicationContext(),
                Process.myPid());
        Log.e(TAG, "application start, process name:" + processName);
    }
}
