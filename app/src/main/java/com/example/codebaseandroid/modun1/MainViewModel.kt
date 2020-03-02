package com.example.codebaseandroid.modun1

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers

class MainViewModel(val repository: TodoRepository) : ViewModel() {

    val getTodo2 = liveData(Dispatchers.IO) {
        val result = repository.getTodo2(1)
        emit(Resource.loading(null))
        emit(result)
    }
}