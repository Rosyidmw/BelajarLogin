package com.example.belajarlogin.api.login.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserResponse {
    @SerializedName("data")
    @Expose
    var data1: User1? = null

    class User1 {
        @SerializedName("username")
        @Expose
        var username: String? = null

        @SerializedName("email")
        @Expose
        var email: String? = null
    }
}