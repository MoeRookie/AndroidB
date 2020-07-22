package com.liqun.feature01;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);
        Log.e(MainActivity.TAG, "Main2Activity.onCreate: 方法被调用了 ...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(MainActivity.TAG, "Main2Activity.onStart: 方法被调用了 ...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(MainActivity.TAG, "Main2Activity.onResume: 方法被调用了 ...");
    }
}
