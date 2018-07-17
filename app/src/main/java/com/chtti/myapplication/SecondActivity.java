package com.chtti.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        Bundle bundle = getIntent().getExtras();
        String message1 = bundle.getString(MainActivity.KEY1);
        Button button1 = findViewById(R.id.button1);
        button1.setText(message1);

        button1.setOnClickListener(this);
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new Foo());

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new Bar(this));

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this, "buttom5 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(v -> Toast.makeText(SecondActivity.this, "buttom6 clicked", Toast.LENGTH_SHORT).show());

        // more code will be added here
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button1:
                Toast.makeText(this, "buttom1 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this, "buttom2 clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private class Foo implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Toast.makeText(SecondActivity.this, "buttom3 clicked", Toast.LENGTH_SHORT).show();
        }
    }
}
