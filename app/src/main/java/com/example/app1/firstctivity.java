package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class firstctivity extends AppCompatActivity {

    public static String EXTRA_PHONE = "com.example.app1.EXTRA_PHONE";
    public static String EXTRA_NAME = "com.example.app1.EXTRA_NAME";
    Button oferrs,restourant;
    String name,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstctivity);
        Intent intent = getIntent();
         name = intent.getStringExtra(EXTRA_NAME);
        phone = intent.getStringExtra(EXTRA_PHONE);


        oferrs = findViewById(R.id.offers_btn);
        restourant =findViewById(R.id.restourants_btn);
        restourant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(firstctivity.this,secandActivity.class);
                intent.putExtra(EXTRA_NAME,name);
                intent.putExtra(EXTRA_PHONE,phone);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_id_right,R.anim.slide_out_left);



            }
        });

        oferrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(firstctivity.this,offersActivity.class);
                intent1.putExtra(EXTRA_NAME,name);
                intent1.putExtra(EXTRA_PHONE,phone);
                startActivity(intent1);
                overridePendingTransition(R.anim.slide_id_right,R.anim.slide_out_left);            }
        });
    }
}
