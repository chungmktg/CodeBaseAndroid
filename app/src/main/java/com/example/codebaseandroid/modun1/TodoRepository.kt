package com.example.codebaseandroid.modun1



abstract class TodoRepository {

    abstract suspend fun getTodo2 (id: Int) : Resource<Todo>

}