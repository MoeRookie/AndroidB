package com.liqun.chapter02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

// 2.1. AndroidIPC简介
// 2.2. Android中的多进程模式
// 2.2.1. 开启多进程模式
// 2.2.2. 多进程模式的运行机制
// 2.3. IPC基础概念介绍
public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 修改静态变量的值
        UserManager.sUserId = 2;

        findViewById(R.id.btn_enter_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "[MainActivity.onCreate] : "+UserManager.sUserId); // 打印静态变量的值
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}