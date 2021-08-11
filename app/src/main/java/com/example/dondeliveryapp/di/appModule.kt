package com.example.dondeliveryapp.di

import com.example.dondeliveryapp.screen.main.home.HomeViewModel
import com.example.dondeliveryapp.screen.main.my.MyViewModel
import com.example.dondeliveryapp.utils.provider.DefaultResourcesProvider
import com.example.dondeliveryapp.utils.provider.ResourcesProvider
import kotlinx.coroutines.Dispatchers
import org.koin.android.experimental.dsl.viewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named

import org.koin.dsl.module

val appModule = module {

    viewModel { HomeViewModel() }
    viewModel { MyViewModel() }

    single { provideGsonConverterFactory() }
    single { buildOkHttpClient() }

    single{ provideRetrofit(get(), get())}

    single<ResourcesProvider> { DefaultResourcesProvider(androidApplication()) }

    single { Dispatchers.IO }
    single { Dispatchers.Main }

}
