package ru.shadowsparky.daggertest.dagger

import dagger.Component
import ru.shadowsparky.daggertest.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [(ContextModule::class)])
interface ContextComponent {
//    var context: Context
    fun inject(mainActivity: MainActivity)
//    fun inject(app: App)
}