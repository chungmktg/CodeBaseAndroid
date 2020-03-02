package com.example.codebaseandroid.modun1

import java.lang.Exception

class TodoRepositoryImpl : TodoRepository(){
    var client: Webservice = RetrofitClient.webservice

    override suspend fun getTodo2(id: Int): Resource<Todo> {
        return try {
            ResponseHandler().handleSuccess(client.getTodo2(id))
        } catch (e : Exception){
            ResponseHandler().handleException(e)
        }
    }

}