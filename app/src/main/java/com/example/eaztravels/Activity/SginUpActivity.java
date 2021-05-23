package com.example.eaztravels.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eaztravels.R;

public class SginUpActivity extends AppCompatActivity {
    public Button btn_sginup;
    public TextView tx_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgin_up_);

        btn_sginup = (Button) findViewById(R.id.sgin_up);
        tx_login = (TextView) findViewById(R.id.login_txt);

        btn_sginup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SginUpActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        tx_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SginUpActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });


    }
}