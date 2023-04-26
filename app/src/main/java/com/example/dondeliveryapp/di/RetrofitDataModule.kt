package com.example.dondeliveryapp.di


import com.example.cleanarchitecturestudy.data.repository.DataFlowRepository
import com.example.cleanarchitecturestudy.data.repository.DataFlowRepositoryImpl
import com.example.cleanarchitecturestudy.data.service.DataService
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(ViewModelComponent::class)
abstract class RetrofitDataModule {
    @Binds
    @ViewModelScoped
    abstract fun bindDataFlowRepository(dataFlowRepositoryImpl: DataFlowRepositoryImpl): DataFlowRepository

    companion object {

        private const val TMAP_URL = "https://apis.openapi.sk.com"
        private const val FOOD_URL = "https://60abc8f15a4de40017ccae3e.mockapi.io/"

        @Provides
        @ViewModelScoped
        fun provideTmapApiService(): DataService =
            Retrofit.Builder()
                .baseUrl(TMAP_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
                .create(DataService::class.java)

        @Provides
        @ViewModelScoped
        fun provideFoodApiService(): DataService =
            Retrofit.Builder()
                .baseUrl(FOOD_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
                .create(DataService::class.java)

        private val client by lazy {
            OkHttpClient.Builder().apply {
                addInterceptor(
                    HttpLoggingInterceptor().apply {
                        level = HttpLoggingInterceptor.Level.BODY
                    }
                )
            }.build()
        }
    }
}