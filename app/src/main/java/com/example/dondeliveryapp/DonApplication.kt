package com.example.dondeliveryapp

import android.app.Application
import android.content.Context
import com.example.dondeliveryapp.di.appModule
import org.koin.core.context.startKoin

class DonApplication :Application() {

    override fun onCreate() {
        super.onCreate()
        appContext = this

        startKoin{
            modules(appModule)
        }
    }

    override fun onTerminate() {
        super.onTerminate()
        appContext = null
    }

    companion object{
        var appContext: Context? =null
            private set
    }

}