package ru.shadowsparky.daggertest

import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.shadowsparky.daggertest.dagger.App
import ru.shadowsparky.daggertest.dagger.ContextWorker
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var worker: ContextWorker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        App.component.inject(this)
        worker.test()
    }
}
