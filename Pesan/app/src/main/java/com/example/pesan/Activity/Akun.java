package com.example.pesan.Activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.pesan.R;

public class Akun extends AppCompatActivity {
    EditText enama, eemail, epass;
    Button btnubah, btnsimpan;
    ImageView profil;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun);


        enama = findViewById(R.id.enama);
        eemail = findViewById(R.id.eemail);
        epass = findViewById(R.id.epasword);

        profil = findViewById(R.id.profil);
        btnubah = findViewById(R.id.btngantifoto);
        btnubah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setRequestImage();

            }
        });

    }

    private void setRequestImage() {
        CharSequence[] item = {"Kamera", "Galeri"};
        AlertDialog.Builder request = new AlertDialog.Builder(this)
                .setTitle("Add Image")
                .setItems(item, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        switch (i) {
                            case 0:

                                //Membuka Kamera Untuk Mengambil Gambar
                                EasyImage.openCamera(Akun.this, REQUEST_CODE_CAMERA);
                                break;
                            case 1:
                                //Membuaka Galeri Untuk Mengambil Gambar
                                EasyImage.openGallery(Akun.this, REQUEST_CODE_GALLERY);
                                break;
                        }
                    }
                });
        request.create();
        request.show();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        EasyImage.handleActivityResult(requestCode,resultCode,data,this,new EasyImage.Callbacks) {

            public void onImagePickerError (Exception e, EasyImage.ImageSource source;
            source,int type){
            }
            public void onImagePicked (File imageFile, EasyImage.ImageSource source,int type){
                //Method Ini Digunakan Untuk Menghandle Image
                switch (type) {
                    case REQUEST_CODE_CAMERA:
                        Glide.with(Akun.this)
                                .load(imageFile)
                                .centerCrop()
                                .diskCacheStrategy(DiskCacheStrategy.ALL)
                                .into(setImage);
                        break;

                    case REQUEST_CODE_GALLERY:
                        Glide.with(Akun.this)
                                .load(imageFile)
                                .centerCrop()
                                .diskCacheStrategy(DiskCacheStrategy.ALL)
                                .into(setImage);
                        break;
                }
            }
            public void onCanceled (EasyImage.ImageSource source,int type){
                //Batalkan penanganan, Anda mungkin ingin menghapus foto yang diambil jika dibatalkan
            }

        };
    }
}