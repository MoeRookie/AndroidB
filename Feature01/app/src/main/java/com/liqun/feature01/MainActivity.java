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
    public static final String EXTRA_TIME = "time";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate");

        findViewById(R.id.btn_enter_main2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra(EXTRA_TIME, System.currentTimeMillis());
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e(TAG, "onNewIntent, time=" + intent.getLongExtra(EXTRA_TIME, 0));
    }
}