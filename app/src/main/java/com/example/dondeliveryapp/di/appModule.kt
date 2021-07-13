package com.example.dondeliveryapp.di

import com.example.dondeliveryapp.utils.provider.DefaultResourcesProvider
import com.example.dondeliveryapp.utils.provider.ResourcesProvider
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.koin.androidApplication
import org.koin.core.qualifier.named

import org.koin.dsl.module

val appModule = module {

    single { provideGsonConverterFactory() }
    single { buildOkHttpClient() }

    single{ provideRetrofit(get(), get())}

    single<ResourcesProvider> { DefaultResourcesProvider(androidApplication()) }

    single { Dispatchers.IO }
    single { Dispatchers.Main }

}
