package com.example.codebaseandroid.modun1

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface Webservice {
    @GET("/todos/{id}")
    fun getTodo(@Path(value = "id") todoId: Int): Call<Todo>

    @GET("/todos/{id}")
    suspend fun getTodo2(@Path(value = "id") todoId: Int) : Todo
}