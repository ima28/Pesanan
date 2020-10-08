package com.example.pesan.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pesan.Model.ResponRegister;
import com.example.pesan.R;
import com.example.pesan.Retrofit.RetrofitLinkApi;
import com.example.pesan.Retrofit.RetrofitMethod;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Register extends AppCompatActivity {

    private EditText edtnama, edtemaill, edtnotlp, edtpassword;

    private Button btnregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        edtnama = findViewById(R.id.edtnama);
        edtemaill=findViewById(R.id.edtemaill);
        edtpassword=findViewById(R.id.edtpassword);
        edtnotlp=findViewById(R.id.edtnotlp);

        btnregister=findViewById(R.id.btnregister);

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Register();

            }
        });

    }


    public void Register(){

        String nama=edtnama.getText().toString();
        String email=edtemaill.getText().toString();
        String pass=edtpassword.getText().toString();
        String phone=edtnotlp.getText().toString();

        RetrofitMethod retrofitMethod =  RetrofitLinkApi.getRetrofitLogin().create(RetrofitMethod.class);
        Call<ResponRegister> call= retrofitMethod.registerUser(nama,email,pass,phone);
        call.enqueue(new Callback<ResponRegister>() {
            @Override
            public void onResponse(Call<ResponRegister> call, Response<ResponRegister> response) {
                if(response.isSuccessful()){

                }

                else {
                    // error case
                    switch (response.code()) {
                        case 404:
                            Toast.makeText(Register.this, " not found", Toast.LENGTH_SHORT).show();
                            break;
                        case 500:
                            Toast.makeText(Register.this, "server error", Toast.LENGTH_SHORT).show();
                            break;
                        case 401:
                            Toast.makeText(Register.this, " sorry can't authenticated, try again", Toast.LENGTH_SHORT).show();
                            break;

                        default:
                            Toast.makeText(Register.this, "unknown error ", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }

            }

            @Override
            public void onFailure(Call<ResponRegister> call, Throwable t) {
                Toast.makeText(Register.this, "network failure :( inform the user and possibly retry ", Toast.LENGTH_SHORT).show();

            }
        });






    }
}