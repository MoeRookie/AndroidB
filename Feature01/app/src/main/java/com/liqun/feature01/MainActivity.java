package com.liqun.feature01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
// 1.1. Activity的生命周期全面分析
// 1.1.1. 典型情况下的生命周期分析
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}