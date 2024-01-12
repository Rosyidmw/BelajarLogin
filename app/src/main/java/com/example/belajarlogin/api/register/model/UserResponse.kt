package com.example.belajarlogin.api.register.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserResponse {
    @SerializedName("data")
    @Expose
    var data: User? = null

    class User {
        @SerializedName("username")
        @Expose
        var username: String? = null

        @SerializedName("email")
        @Expose
        var email: String? = null
    }
}