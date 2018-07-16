package com.chtti.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;

import com.chtti.demolib.LibraryMain;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MY_FIRST_APP";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int result = LibraryMain.add(3,5);
        Log.v(TAG, "result="+result);
        setContentView(R.layout.activity_main);
    }
}