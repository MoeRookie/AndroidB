package com.liqun.feature01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

// 1.1. Activity的生命周期全面分析
// 1.1.1. 典型情况下的生命周期分析
public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_enter_main2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);
            }
        });
    }
    // 验证onRestart(...)方法
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "MainActivity.onRestart: 方法被调用了 ...");
    }
}