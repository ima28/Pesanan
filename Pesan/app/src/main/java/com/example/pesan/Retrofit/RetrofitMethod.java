package com.example.pesan.Retrofit;

import com.example.pesan.Model.ResponRegister;
import com.example.pesan.Model.ResponToken;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public class RetrofitMethod {
    @FormUrlEncoded
    @POST("auth/login")
    Call<ResponRegister> registerUser(@Field("nameOrd") String name, @Field("username") String username, @Field("email") String email, @Field("password") String password) {
        return null;
    }


    @FormUrlEncoded
    @POST("auth/login")
    Call<ResponToken> loginUser(@Field("usernameOrEmai") String usernameOrEmai, @Field("password") String password) {
        return null;
    }

}

