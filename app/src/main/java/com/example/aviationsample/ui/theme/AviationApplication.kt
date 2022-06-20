package com.example.aviationsample.ui.theme

import android.app.Application
import com.example.aviationsample.ui.theme.koin.AviationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class AviationApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        // start Koin context
        startKoin {
            androidContext(this@AviationApplication)
            androidLogger()
            modules(AviationModule)
        }
    }
}