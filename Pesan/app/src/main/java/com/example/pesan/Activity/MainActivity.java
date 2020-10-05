package com.example.pesan.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.pesan.Adapter.ViewPagerAdapter;
import com.example.pesan.Fragment.HomeFragment;
import com.example.pesan.Fragment.LainFragment;
import com.example.pesan.Fragment.OrderFragment;
import com.example.pesan.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    BottomNavigationView bottomNavigationView;
    HomeFragment fragHome;
    OrderFragment fragOrder;
    LainFragment fragLain;

    MenuItem menuItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.fl_container);
        setupViewPager(viewPager);
        
        //ImageAdapter adapterView = new ImageAdapter(this);
        //mViewPager.setAdapter(adapterView);

        final BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId()) {
                    case R.id.home_menu:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.order_menu:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.lain_menu:
                        viewPager.setCurrentItem(2);
                        break;
                }
                return false;
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                bottomNavigationView.getMenu().getItem(position).setChecked(true);
                menuItem = bottomNavigationView.getMenu().getItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        fragHome = new HomeFragment();
        fragOrder = new OrderFragment();
        fragLain = new LainFragment();

        adapter.addFragment(fragHome);
        adapter.addFragment(fragOrder);
        adapter.addFragment(fragLain);
        viewPager.setAdapter(adapter);
    }

}