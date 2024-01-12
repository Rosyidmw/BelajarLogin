package com.example.belajarlogin.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.belajarlogin.R
import com.example.belajarlogin.api.login.RetroLogin
import com.example.belajarlogin.api.login.UserAPILogin
import com.example.belajarlogin.api.login.model.UserRequest
import com.example.belajarlogin.api.login.model.UserResponse
import com.example.belajarlogin.ui.main.MainActivity
import com.example.belajarlogin.ui.register.RegisterActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginInit()


        val btnRegister : Button = findViewById(R.id.btnRegister)
        btnRegister.setOnClickListener {
            Intent(this@LoginActivity, RegisterActivity::class.java).also {
                startActivity(it)
            }
        }
    }

    fun loginInit() {
        val btnLogin : Button = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            login()
        }
    }

    fun login() {
        Intent(this@LoginActivity, MainActivity::class.java).also {
            startActivity(it)
        }

        val etUsername : EditText = findViewById(R.id.etUsername)
        val etPassword : EditText = findViewById(R.id.etPassword)

        val request = UserRequest()
        request.username = etUsername.text.toString().trim()
        request.password = etPassword.text.toString().trim()

        val retroLogin = RetroLogin().getRetroClientInstance().create(UserAPILogin::class.java)
        retroLogin.login(request).enqueue(object : Callback<UserResponse>{
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                val user = response.body()
                Log.e("username", user!!.data1?.username.toString())
                Log.e("email", user!!.data1?.email.toString())
            }

            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                Log.e("TAG", "Error")
            }

        })
    }
}