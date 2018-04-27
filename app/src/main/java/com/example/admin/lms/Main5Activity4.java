package com.example.admin.lms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity4 extends AppCompatActivity {
    Button Menu;
    Button Logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main54);
        Button Menu = (Button) findViewById(R.id.menu3);
Button Logout =(Button)findViewById(R.id.etLogout);
}
    public void me3(View View) {
        Intent intent = new Intent(Main5Activity4.this, Main7Activity6.class);
        startActivity(intent);
    }
    public void log(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}