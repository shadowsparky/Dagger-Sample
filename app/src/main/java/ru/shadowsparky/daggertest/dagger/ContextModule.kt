package ru.shadowsparky.daggertest.dagger

import android.content.Context
import android.location.LocationManager
import dagger.Module
import android.app.Application
import dagger.Provides
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
class ContextModule(val context: Context) {

    @Provides
    @Singleton
    fun provideWorker() : ContextWorker = ContextWorker(context)

    @Provides
    @Singleton
    fun provideContext() : Context = context
}
