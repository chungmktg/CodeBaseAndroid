package com.example.codebaseandroid.modun1

import android.util.Log
import retrofit2.HttpException

open class ResponseHandler {
    fun <T : Any> handleSuccess(data: T): Resource<T> {
        return Resource.success(data)
    }

    fun <T : Any> handleException(e: Exception): Resource<T> {
        return when (e) {
            is HttpException -> Resource.error(getErrorMessage(e.code()), null)
            else -> Resource.error(getErrorMessage(Int.MAX_VALUE), null)
        }
    }

    private fun getErrorMessage(code: Int): String {
        return when (code) {
            401 -> {
                Log.d("error", code.toString())
                "Unauthorised"
            }
            404 -> {
                Log.d("error", code.toString())
                "Not found"
            }
            else -> {
                Log.d("error", code.toString())
                "Something went wrong"
            }
        }
    }
}