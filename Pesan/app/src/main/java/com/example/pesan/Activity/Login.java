package com.example.pesan.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pesan.R;

public class Login extends AppCompatActivity {
    EditText edtemail,edtpss;
    Button btnlogin;
    SharedPreferencesLogin sharedPreferencesLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);edtemail = (EditText) findViewById(R.id.edtemail);
        edtpss = (EditText) findViewById(R.id.edtpss);
        sharedPreferencesLogin = new SharedPreferencesLogin(Login.this);


        btnlogin = (Button) findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email = edtemail.getText().toString();
                String Pass = edtpss.getText().toString();
                Toast.makeText(getApplicationContext(), "Berhasil Login", Toast.LENGTH_SHORT).show();
                sharedPreferencesLogin.setemail(sharedPreferencesLogin.Email, Email);
                sharedPreferencesLogin.setpasswod(sharedPreferencesLogin.Pass, Pass);
                sharedPreferencesLogin.setsudahLogin(sharedPreferencesLogin.Sudah_Login, true);

                startActivity(new Intent(Login.this, MainActivity.class));
                finish();

            }
        });
    }
}