package com.example.admin.lms;

import android.content.Intent;
import android.media.Ringtone;
import android.service.carrier.CarrierService;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main6Activity5 extends AppCompatActivity {
    Button Ring;
    Button Bangles;
    Button Earing;
    Button Logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main65);
        Ring = (Button) findViewById(R.id.etring);
        Bangles = (Button) findViewById(R.id.etBangle);
        Earing = (Button) findViewById(R.id.etearing);
        Logout=(Button)findViewById(R.id.etlogout);
    }


    public void ring(View view) {

        Intent intent = new Intent(Main6Activity5.this, Main3Activity2.class);
        startActivity(intent);
    }



    public void bag(View view) {

        Intent intent = new Intent(this, Main4Activity3.class);
        startActivity(intent);

    }


    public void ear(View view) {
        Intent intent = new Intent(this, Main5Activity4.class);
        startActivity(intent);
    }
    public void log(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}









