package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private  static  int TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final View mylayout = findViewById(R.id.main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Login_RegisterActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_id_right,R.anim.slide_out_left);
                finish();
            }
        },TIME_OUT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

}