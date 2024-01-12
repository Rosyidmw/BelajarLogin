package com.example.belajarlogin.api.register

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retro {
    fun getretroClientInstance(): Retrofit {
        val gson = GsonBuilder().setLenient().create()
        return Retrofit.Builder()
            .baseUrl("https://taipanagaya-api-v1.alibar.site/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
}