package com.example.pesan.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pesan.Adapter.AdapterRecyclerView;
import com.example.pesan.Model.ItemModel;
import com.example.pesan.R;

import java.util.ArrayList;

public class Produk extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recyclerViewLayoutManager;
    ArrayList<ItemModel> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerViewLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);

        data = new ArrayList<>();
        for (int i = 0; i < List.Headline.length; i++) {
            data.add(new ItemModel(
            List.Headline[i],
                    List.Subhead[i],
                    List.iconList[i]
            ));
        }
        recyclerViewAdapter = new AdapterRecyclerView(data);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}