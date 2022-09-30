package com.example.cardview.api

import com.example.cardview.util.constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy{
        Retrofit.Builder()
            .baseUrl(constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()}

    val api: ApiService by lazy{
        retrofit.create(ApiService::class.java)}
}