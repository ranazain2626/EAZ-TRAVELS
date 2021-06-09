package com.example.eaztravels.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.eaztravels.Base.BaseActivity;
import com.example.eaztravels.Fragments.BookingFragment;
import com.example.eaztravels.Fragments.ChatFragment;
import com.example.eaztravels.Fragments.HomeFragment;
import com.example.eaztravels.Fragments.SettingFragment;
import com.example.eaztravels.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_con,new HomeFragment()).commit();

    }
    private  BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Fragment selectedFragment=null;
            switch (item.getItemId())
            {
                case R.id.nav_home:
                    selectedFragment=new HomeFragment();
                    break;
                case R.id.nav_chat:
                    selectedFragment=new ChatFragment();
                    break;
                case R.id.nav_setting:
                    selectedFragment=new SettingFragment();
                    break;
                case R.id.nav_booking:
                    selectedFragment=new BookingFragment();
                    break;

            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_con,selectedFragment).commit();
            return true;
        }
    };


}