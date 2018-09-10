package ru.shadowsparky.daggertest.dagger

import javax.inject.Qualifier

// Эта аннотация нужна, когда нужно, например, достать Context из активити (по приколу).
@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class AndroidSDK