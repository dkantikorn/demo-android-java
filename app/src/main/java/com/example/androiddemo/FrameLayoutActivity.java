package com.example.androiddemo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class FrameLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Frame layout example");
        setContentView(R.layout.activity_frame_layout);

        //Change for title bare
        //getSupportActionBar().setTitle("Frame layout example");
    }

//    @Override
//    public void setActionBar(String heading) {
//        // TODO Auto-generated method stub
//
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setHomeButtonEnabled(true);
//        actionBar.setDisplayHomeAsUpEnabled(false);
//        actionBar.setDisplayShowHomeEnabled(false);
//        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));
//        actionBar.setTitle(heading);
//        actionBar.show();
//
//    }
}
