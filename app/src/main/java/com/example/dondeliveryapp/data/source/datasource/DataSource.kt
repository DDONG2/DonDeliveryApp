package com.example.cleanarchitecturestudy.data.source.datasource

import com.example.cleanarchitecturestudy.data.service.DataService
import com.example.dondeliveryapp.data.dto.Model
import javax.inject.Inject

class DataSource @Inject constructor(
    private val dataService: DataService
) {
    suspend fun getSearchUsers(
        userId: String,
        page: Int,
        perPage: Int
    ): Model {
        return dataService.getSearchUsers(userId, page, perPage)
    }

}