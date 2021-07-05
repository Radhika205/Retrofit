package com.example.retrofit

import retrofit2.Call
import retrofit2.http.GET


interface Api {
    //urls
    @GET("users?q=rokano")
    fun users(): Call<UsersList>
}