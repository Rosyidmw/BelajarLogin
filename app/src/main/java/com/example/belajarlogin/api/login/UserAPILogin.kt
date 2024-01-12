package com.example.belajarlogin.api.login

import com.example.belajarlogin.api.login.model.UserRequest
import com.example.belajarlogin.api.login.model.UserResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserAPILogin {
    @POST("login")
    fun login(
        @Body userRequest: UserRequest
    ): Call<UserResponse>
}