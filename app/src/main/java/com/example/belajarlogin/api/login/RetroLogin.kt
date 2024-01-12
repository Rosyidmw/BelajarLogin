package com.example.belajarlogin.api.login

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroLogin {
    fun getRetroClientInstance(): Retrofit {
        val gson = GsonBuilder().setLenient().create()
        return Retrofit.Builder()
            .baseUrl("https://taipanagaya-api-v1.alibar.site/login")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
}