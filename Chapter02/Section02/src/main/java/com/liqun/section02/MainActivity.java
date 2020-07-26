package com.liqun.section02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
// 2.3.1. Serializable接口
// 2.3.2. Parcelable接口
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 序列化过程
        // try{
        //     User user = new User(0, "jake", true);
        //     ObjectOutputStream out = new ObjectOutputStream(
        //             new FileOutputStream("data/data/com.liqun.section02/cache.txt"));
        //     out.writeObject(user);
        //     out.close();
        // }catch (IOException e){
        // }

        // 反序列化过程
        try{
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("data/data/com.liqun.section02/cache.txt"));
            User newUser = (User)in.readObject();
            in.close();
            Log.e(TAG, "user.id = " + newUser.userId);
            Log.e(TAG, "user.name = " + newUser.userName);
            Log.e(TAG, "user.gender = " + newUser.isMale);
        }catch (IOException | ClassNotFoundException e){
        }
    }
}
