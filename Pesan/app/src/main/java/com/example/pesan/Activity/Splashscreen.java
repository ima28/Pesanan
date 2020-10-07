package com.example.pesan.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.pesan.R;

public class Splashscreen extends AppCompatActivity {private int load=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent login=new Intent(Splashscreen.this, Register.class);
                startActivity(login);

            }
        },load);
    }
}