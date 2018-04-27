package com.example.admin.lms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.sql.DatabaseMetaData;

public class details extends AppCompatActivity {
    DatabaseMetaData myDb;
    EditText Name,Address,mobile,menu;
    Button booking;
    Button viewData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        myDb =new  Dat(this);
        menu=(EditText)findViewById(R.id.editText);
    }
}
