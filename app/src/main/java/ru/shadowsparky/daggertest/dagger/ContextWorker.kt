package ru.shadowsparky.daggertest.dagger

import android.content.Context
import android.content.Intent
import android.util.Log
import android.util.Log.DEBUG
import ru.shadowsparky.daggertest.MainActivity

open class ContextWorker(val context: Context) {
    fun test() {
        Log.println(DEBUG, "MAIN_TAG", "test $context")
    }
}