package com.example.codebaseandroid

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.codebaseandroid.modun1.MainViewModel
import com.example.codebaseandroid.modun1.Status
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel



class MainActivity : AppCompatActivity() {
    lateinit var myApplication: MyApplication
    val mainViewModel: MainViewModel by viewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myApplication = MyApplication()
        myApplication.startkoin()
        showTodo2()
    }

    private fun showTodo2() {
        mainViewModel.getTodo2.observe(this, Observer {
           titleTextView.text = it.data?.title
        })
    }



}
