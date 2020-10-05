package com.example.pesan.Retrofit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitLinkApi {
    private static Retrofit retrofit=null;
    private RetrofitLinkApi(){

    }

    public static Retrofit getRetrofitLogin() {

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();

// set log level
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();

//add logging
        okHttpClient.addInterceptor(httpLoggingInterceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("192.168.100.168:8080/api/")
                .client(okHttpClient.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;

    }

}

