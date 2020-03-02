package com.example.codebaseandroid

import android.app.Application
import com.example.codebaseandroid.modun1.MainViewModel
import com.example.codebaseandroid.modun1.TodoRepository
import com.example.codebaseandroid.modun1.TodoRepositoryImpl
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MyApplication : Application(){

    val appModule = module {
        single<TodoRepository> { TodoRepositoryImpl() }
        viewModel { MainViewModel(get()) }
    }

    fun startkoin(){
        startKoin{
            androidLogger()
            androidContext(this@MyApplication)
            modules(appModule)
        }
    }
}
