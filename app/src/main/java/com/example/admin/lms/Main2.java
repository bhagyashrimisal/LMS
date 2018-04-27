package com.example.admin.lms;

import android.content.Intent;
import android.location.Address;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2 extends AppCompatActivity {
    private EditText Name, Address,ContactNo,Email,pssword;
    Button Submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Name = (EditText) findViewById(R.id.etName);
        Address=(EditText)findViewById(R.id.etaddress);
        ContactNo=(EditText)findViewById(R.id.etcontactno);
        Email=(EditText)findViewById(R.id.etemail);
        Submit = (Button) findViewById(R.id.Submit);
    }

    private void validate(String Name, String password, String Address, String Contactno, String Email){
        Intent intent = new Intent(this, Main6Activity5.class);
        startActivity(intent);
    }


    public void sub(View View) {
        Intent intent= new Intent(this, Main6Activity5.class);
        startActivity(intent);
    }
}









