package com.example.eaztravels.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eaztravels.R;

public class LoginActivity extends AppCompatActivity {

    public Button btnlogin;
    public TextView txsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnlogin = (Button) findViewById(R.id.login);
        txsignup = (TextView) findViewById(R.id.sgin_up_txt);


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        txsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(LoginActivity.this, SginUpActivity.class);
                startActivity(intent);
            }
        });

    }
}