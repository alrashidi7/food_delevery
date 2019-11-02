package com.example.app1;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;



public class RestourantActivity extends AppCompatActivity {

    TextView textView;
    public static String EXTRA_PHONE = "com.example.app1.EXTRA_PHONE";
    public static String EXTRA_NAME = "com.example.app1.EXTRA_NAME";
    //setup items1
    public static String EXTRA_TOTAL= "com.example.app1.EXTRA_TOTAL";

    String total,name,phone;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restourant);
        Intent intent = getIntent();
       total= intent.getStringExtra(EXTRA_TOTAL);
       name= intent.getStringExtra(EXTRA_NAME);
       phone= intent.getStringExtra(EXTRA_PHONE);
      textView = findViewById(R.id.orders_restorant);
      textView.setText(total);


    }
}
