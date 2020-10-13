package com.example.pesan.Retrofit;

import com.example.pesan.Model.ResponRegister;
import com.example.pesan.Model.ResponToken;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RetrofitMethod {
    @Headers({
            "Content-Type:application/json"
    })

    @POST("auth/signup")
    Call<ResponRegister> registerUser(@Body JsonObject body);

}

