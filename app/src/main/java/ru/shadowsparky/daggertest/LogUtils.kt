package ru.shadowsparky.daggertest

import android.util.Log
import android.util.Log.DEBUG

open class LogUtils {
    companion object {
        fun print(message: String) {
            Log.println(DEBUG, "MAIN_TAG", "Thread: ${Thread.currentThread().name}. $message")
        }
    }   
}