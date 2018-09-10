package ru.shadowsparky.daggertest.dagger

import android.app.Application
import android.location.LocationManager
import ru.shadowsparky.daggertest.LogUtils
import javax.inject.Inject

// fixme ! ЖЕНЯ, ДЕБИЛ НЕ ЗАБУДЬ APPLICATION КЛАСС УКАЗАТЬ В МАНИФЕСТЕ !
class App : Application() {

    companion object {
        @JvmStatic lateinit var component: ContextComponent
    }

    override fun onCreate() {
        super.onCreate()
        component = DaggerContextComponent.builder().contextModule(ContextModule(applicationContext)).build()
    }
}