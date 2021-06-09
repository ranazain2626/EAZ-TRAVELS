package com.example.eaztravels.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.eaztravels.Adapters.BookingAdapter;
import com.example.eaztravels.Adapters.PackagesAdapter;
import com.example.eaztravels.R;

public class TravelingPackagesActivity extends AppCompatActivity {

    int done=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traveling_pakges);

        done=getIntent().getIntExtra("done",0);

        RecyclerView rv= (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        if(done==1) {
            String data[] = {"1"};
            PackagesAdapter adapter = new PackagesAdapter(this, data, done);
            rv.setAdapter(adapter);
        }
        else {
            String data[] = {"1", "1", "12"};
            PackagesAdapter adapter = new PackagesAdapter(this, data, done);
            rv.setAdapter(adapter);
        }

    }
}