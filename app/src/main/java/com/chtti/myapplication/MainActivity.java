package com.chtti.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
// import android.support.v7.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.chtti.demolib.LibraryMain;

public class MainActivity extends Activity {
    private static final String TAG = "MY_FIRST_APP";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int result = LibraryMain.add(3,5);
        Log.v(TAG, "result="+result);
        setContentView(R.layout.activity_main);
        // View view = new View(this);
        TextView textView = findViewById(R.id.textView2);
        String[] dayOfWeek = getResources().getStringArray(R.array.dayOfWeek);
        StringBuilder builder = new StringBuilder();
        for(String day : dayOfWeek){
            builder.append(day);
            builder.append(" ");
        }
        builder.append("\n");
        textView.setText(builder.toString());
    }

    protected static final String KEY1 = "message1";
    public void doActivity(View view) {
        Intent intent = new Intent();
        intent.setClass(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(KEY1, "hello world");
        intent.putExtras(bundle);
        startActivity(intent);
    }


    public void doCall(View view){
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:454545"));
        try{
            startActivity(intent);
        }catch(SecurityException se){

            TextView textView = findViewById(R.id.textView2);
            textView.setText("need to set permossion in... resion=" + se.getMessage());
        }
    }

    public void doGoogle(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://google.com.tw"));
        startActivity(intent);
    }
}