package com.example.pesan.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.pesan.Fragment.LainFragment;
import com.example.pesan.R;

import org.jetbrains.annotations.Nullable;

public class Akun extends AppCompatActivity {
    TextView enama, eemail, epass,enotlp;
    Button btnkembali;
    //private static final int SELECT_IMAGE = 100;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun);

        enama = findViewById(R.id.eusernama);
        eemail = findViewById(R.id.eemail);
        epass = findViewById(R.id.epassword);
        enotlp = findViewById(R.id.enotlp);

        btnkembali = findViewById(R.id.btnkembali);
        btnkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**String Username = enama.getText().toString();
                 String Email = eemail.getText().toString();
                 String Password = epass.getText().toString();
                 String NoTlp = enotlp.getText().toString();*/
                Intent i = new Intent(Akun.this, LainFragment.class);
                startActivity(i);
            }
        });
    }
}



/**enama = findViewById(R.id.enama);
eemail = findViewById(R.id.eemail);
epass = findViewById(R.id.epasword);

profil = findViewById(R.id.profil);
btnubah = findViewById(R.id.btngantifoto);
btnubah.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i = new Intent(
                Intent.ACTION_PICK,
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

        startActivityForResult(i, SELECT_IMAGE);
    }
});
}

@Override
protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
super.onActivityResult(requestCode, resultCode, data);

if (requestCode == SELECT_IMAGE && resultCode == RESULT_OK && null != data) {
    Uri selectedImage = data.getData();
    String[] filePathColumn = {MediaStore.Images.Media.DATA};
    Cursor cursor = getContentResolver().query(selectedImage,
            filePathColumn, null, null, null);
    cursor.moveToFirst();

    int columIndex = cursor.getColumnIndex(filePathColumn[0]);
    String picturePath = cursor.getString(columIndex);
    cursor.close();

    ImageView profil = findViewById(R.id.profil);
    profil.setImageBitmap(BitmapFactory.decodeFile(picturePath));

}
}*/
