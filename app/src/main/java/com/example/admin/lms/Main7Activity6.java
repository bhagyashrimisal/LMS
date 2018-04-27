package com.example.admin.lms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main7Activity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main76);
        Button productentry = (Button) findViewById(R.id.radioButton);
    }


    public void productentry(View view) {
        Intent intent = new Intent(Main7Activity6.this, Main8Activity5.class);
        startActivity(intent);


    }
}

