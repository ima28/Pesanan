package com.example.pesan.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.pesan.Fragment.HomeFragment;
import com.example.pesan.Fragment.LainFragment;
import com.example.pesan.Fragment.OrderFragment;
import com.example.pesan.Model.ImageAdapter;
import com.example.pesan.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ViewPager mViewPager = findViewById(R.id.viewPager);
        //ImageAdapter adapterView = new ImageAdapter(this);
        //mViewPager.setAdapter(adapterView);


        getFragmentPage(new HomeFragment());

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId()) {
                    case R.id.home_menu:
                        fragment = new HomeFragment();
                        break;
                    case R.id.order_menu:
                        fragment = new OrderFragment();
                        break;
                    case R.id.lain_menu:
                        fragment = new LainFragment();
                        break;
                }
                return getFragmentPage(fragment);
            }
        });
    }

    private boolean getFragmentPage(Fragment fragment) {
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fl_container,fragment)
                    .commit();
            return true;
        }
        return false;
    }
}