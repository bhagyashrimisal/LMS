package com.example.admin.lms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity2 extends AppCompatActivity {
    Button menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main32);
        menu = (Button) findViewById(R.id.menu3);
    }
    public void menu(View View) {
        Intent intent = new Intent(this, Main7Activity6.class);
        startActivity(intent);
    }
}


