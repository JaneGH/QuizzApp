package com.itclimb.quizzapp.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {
    val baseURL = "http://192.168.24.240/quiz/"

    fun getRetrofitInstance(): Retrofit{
        return Retrofit.Builder().baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }
}