package com.example.belajarlogin.api.register

import com.example.belajarlogin.api.register.model.UserRequest
import com.example.belajarlogin.api.register.model.UserResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserAPI {
    @POST("register")
    fun register(
        @Body userRequest: UserRequest
    ): Call<UserResponse>
}