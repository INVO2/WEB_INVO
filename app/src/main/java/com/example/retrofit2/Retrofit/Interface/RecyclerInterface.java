package com.example.retrofit2.Retrofit.Interface;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RecyclerInterface {

    String JSONURL = "https://raw.githubusercontent.com/INVO2/server/master/";

    @GET("pharmacy.json")
    Call<String> getString();
}
