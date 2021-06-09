package com.example.eaztravels.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.eaztravels.Base.BaseActivity;
import com.example.eaztravels.R;

public class PackageDetailsActivity extends BaseActivity {

    LinearLayout flights_btn,hotels_btn,request_btn;
    LinearLayout flights,hotels,request;
    ImageView flight_image,hotel_image,request_image;
    TextView flight_text,hotel_text, request_text;
    Button confirm_package;
    int done=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pacakge_details);

        done=getIntent().getIntExtra("done",0);

        confirm_package=findViewById(R.id.confirm_package);
        confirm_package.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMessage("This package has been confirmed ! Our operator will contact you for payment process soon");
            }
        });

        if(done==1)
        {
            confirm_package.setVisibility(View.GONE);
        }
        flights=findViewById(R.id.flights);
        hotels=findViewById(R.id.hotels);
        request=findViewById(R.id.special_request);

        flights_btn=findViewById(R.id.flights_btn);
        hotels_btn=findViewById(R.id.hotels_btn);
        request_btn=findViewById(R.id.request_btn);

        flight_image=findViewById(R.id.flight_image);
        hotel_image=findViewById(R.id.hotel_image);
        request_image=findViewById(R.id.request_image);

        flight_text=findViewById(R.id.flight_text);
        hotel_text=findViewById(R.id.hotel_text);
        request_text=findViewById(R.id.request_text);


        flights_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flights.setVisibility(View.VISIBLE);
                flight_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                flight_image.setColorFilter(ContextCompat.getColor(PackageDetailsActivity.this, R.color.colorPrimary), android.graphics.PorterDuff.Mode.SRC_IN);

                hotels.setVisibility(View.GONE);
                hotel_text.setTextColor(getResources().getColor(R.color.gray));
                hotel_image.setColorFilter(ContextCompat.getColor(PackageDetailsActivity.this, R.color.gray), android.graphics.PorterDuff.Mode.SRC_IN);

                request.setVisibility(View.GONE);
                request_text.setTextColor(getResources().getColor(R.color.gray));
                request_image.setColorFilter(ContextCompat.getColor(PackageDetailsActivity.this, R.color.gray), android.graphics.PorterDuff.Mode.SRC_IN);
            }
        });

        hotels_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flights.setVisibility(View.GONE);
                flight_text.setTextColor(getResources().getColor(R.color.gray));
                flight_image.setColorFilter(ContextCompat.getColor(PackageDetailsActivity.this, R.color.gray), android.graphics.PorterDuff.Mode.SRC_IN);

                hotels.setVisibility(View.VISIBLE);
                hotel_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                hotel_image.setColorFilter(ContextCompat.getColor(PackageDetailsActivity.this, R.color.colorPrimary), PorterDuff.Mode.SRC_IN);

                request.setVisibility(View.GONE);
                request_text.setTextColor(getResources().getColor(R.color.gray));
                request_image.setColorFilter(ContextCompat.getColor(PackageDetailsActivity.this, R.color.gray), android.graphics.PorterDuff.Mode.SRC_IN);
            }
        });

        request_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flights.setVisibility(View.GONE);
                flight_text.setTextColor(getResources().getColor(R.color.gray));
                flight_image.setColorFilter(ContextCompat.getColor(PackageDetailsActivity.this, R.color.gray), android.graphics.PorterDuff.Mode.SRC_IN);

                hotels.setVisibility(View.GONE);
                hotel_text.setTextColor(getResources().getColor(R.color.gray));
                hotel_image.setColorFilter(ContextCompat.getColor(PackageDetailsActivity.this, R.color.gray), android.graphics.PorterDuff.Mode.SRC_IN);

                request.setVisibility(View.VISIBLE);
                request_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                request_image.setColorFilter(ContextCompat.getColor(PackageDetailsActivity.this, R.color.colorPrimary), android.graphics.PorterDuff.Mode.SRC_IN);
            }
        });


    }
}