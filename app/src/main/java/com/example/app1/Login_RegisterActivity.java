package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class Login_RegisterActivity extends AppCompatActivity {

    Button login, register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final View mylayout = findViewById(R.id.main);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__register);


        login = findViewById(R.id.mainLogin_btn);
        register = findViewById(R.id.register_btn);

        //setup login button
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_id_right, R.anim.slide_out_left);
            }
        });
        //setup register button
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_RegisterActivity.this, RegisterActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_id_right, R.anim.slide_out_left);


            }
        });


    }
}

