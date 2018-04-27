package com.example.admin.lms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.net.PasswordAuthentication;

public class MainActivity extends AppCompatActivity {
    private ImageView img1;
    private EditText Name, password;
    Button Login1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = (ImageView) findViewById(R.id.image);
        Name = (EditText) findViewById(R.id.etName);
        password = (EditText) findViewById(R.id.etpssword);
        Login1 = (Button) findViewById(R.id.etlogin);
        validate((Name.getText().toString()), password.getText().toString());
    }



    private void validate(String UserName, String Userpassword) {
        if ((UserName == "Abc") && (Userpassword == "123456")) {
            Intent intent = new Intent(MainActivity.this, Main6Activity5.class);
            startActivity(intent);
        }

    }

    public void log(View view) {
        String uname = Name.getText().toString(), pass = password.getText().toString();
        if (uname.contentEquals("Abc") && pass.contentEquals("123456")) {
            Intent intent = new Intent(this,Main2.class);
            startActivity(intent);
        }
    }
}
