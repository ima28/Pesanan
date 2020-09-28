package com.example.pesan.Activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pesan.R;

public class Tentang extends AppCompatActivity {
    TextView txttentang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        //Inisialisasi dan Deklarasi TextView
        txttentang = findViewById(R.id.txttentang);

        //Menambahkan method Scrolling agar TextView dapat di Scroll
        txttentang.setMovementMethod(new ScrollingMovementMethod());
    }

}