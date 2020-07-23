package com.liqun.feature01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;

// 1.1. Activity的生命周期全面分析
// 1.1.1. 典型情况下的生命周期分析
// 1.1.2. 异常情况下的生命周期分析

// 1.2. Activity的启动模式
// 1.2.1. Activity的LaunchMode
public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    public static final String KEY_0 = "extra_test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            String test = savedInstanceState.getString(KEY_0);
            Log.e(TAG, "[onCreate] restore extra_test:" + test);
        }

        findViewById(R.id.btn_enter_main2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String test = savedInstanceState.getString(KEY_0);
        Log.e(TAG, "[onRestoreInstanceState] restore extra_test:" + test);
    }

    // 验证onRestart(...)方法
    @Override
    protected void onRestart() {
        super.onRestart();
        // Log.e(TAG, "MainActivity.onRestart: 方法被调用了 ...");
    }

    // 不能在onPause(...)方法中做耗时操作, 因为必须等到此方法执行完才能够执行新activity的onResume(...)方法

    @Override
    protected void onPause() {
        super.onPause();
        // Log.e(TAG, "MainActivity.onPause: 方法被调用了 ...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        // Log.e(TAG, "MainActivity.onStop: 方法被调用了 ...");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(TAG, "[onSaveInstanceState]");
        outState.putString(KEY_0,"test");
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e(TAG, "onConfigurationChanged, newOrientation:" + newConfig.orientation );
    }
}