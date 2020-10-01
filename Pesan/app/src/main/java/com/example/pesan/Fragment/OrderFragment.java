package com.example.pesan.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.pesan.R;

public class OrderFragment extends Fragment {
    Button btnkirim;
    EditText edtnama, edtemail, edtnamaperusahaan, edtnamaapk, edtjnsapk, edtdeskripsi, edtbudget, edttimelin;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentorder, container, false);
        edtnama = view.findViewById(R.id.edtnama);
        edtemail = view.findViewById(R.id.edtemail);
        edtnamaperusahaan = view.findViewById(R.id.edtnamaperusahaan);
        edtnamaapk = view.findViewById(R.id.edtaplikasi);
        edtjnsapk = view.findViewById(R.id.edtjenisapk);
        edtdeskripsi = view.findViewById(R.id.edtdeskripsi);
        edtbudget = view.findViewById(R.id.edtbudget);
        edttimelin = view.findViewById(R.id.edttimeline);

        btnkirim = view.findViewById(R.id.btnkirim);
        btnkirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pesan1 = edtnama.getText().toString();
                String pesan2 = edtemail.getText().toString();
                String pesan3 = edtnamaperusahaan.getText().toString();
                String pesan4 = edtnamaapk.getText().toString();
                String pesan5 = edtjnsapk.getText().toString();
                String pesan6 = edtdeskripsi.getText().toString();
                String pesan7 = edtbudget.getText().toString();
                String pesan8 = edttimelin.getText().toString();

                String semuapesan = "Nama: " + pesan1 + "\n" + "Email: " + pesan2 + "\n" + "Nama Perusahaan: " + pesan3 + "\n" + "Nama Aplikasi: " + pesan4 + "\n" + "Jenis Aplikasi: " + pesan5 + "\n" + "Deskripsi: " + pesan6 + "\n" + "Budget: " + pesan7 + "\n" + "Timeline: " + pesan8;
                //String Url = "https://api.whatsapp.com/send?phone=6285641187175" ;

                Intent kirimWA = new Intent(Intent.ACTION_SEND);
                kirimWA.setType("text/plain");
                kirimWA.putExtra(Intent.EXTRA_TEXT, semuapesan);
                kirimWA.putExtra("ima", "+6285641187175" + "@s.whatsapp.net");
                kirimWA.setPackage("com.whatsapp");
                startActivity(kirimWA);


            }
        });

        return view;
    }

}

