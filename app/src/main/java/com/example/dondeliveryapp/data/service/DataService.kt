package com.example.cleanarchitecturestudy.data.service

import com.example.dondeliveryapp.data.dto.Model
import retrofit2.http.GET
import retrofit2.http.Query

interface DataService {
    @GET("search/users")
    suspend fun getSearchUsers(
        @Query("q") q: String,
        @Query("page") page: Int,
        @Query("perPage") perPage: Int
    ): Model
}
