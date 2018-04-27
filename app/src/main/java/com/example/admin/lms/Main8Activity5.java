package com.example.admin.lms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main8Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main85);
    }


    public void sub1(View vew){
        Intent intent = new Intent(this, Main9Activity7.class);
        startActivity(intent);
            }
        }






