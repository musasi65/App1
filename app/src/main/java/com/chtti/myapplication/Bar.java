package com.chtti.myapplication;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

class Bar implements View.OnClickListener {
    private Context context;
    public Bar(SecondActivity secondActivity) {
        this.context = secondActivity;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(context, "buttom4 clicked", Toast.LENGTH_SHORT).show();
    }
}
