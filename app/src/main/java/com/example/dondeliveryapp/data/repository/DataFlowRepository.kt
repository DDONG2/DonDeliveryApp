package com.example.cleanarchitecturestudy.data.repository

import com.example.dondeliveryapp.data.dto.Model
import kotlinx.coroutines.flow.Flow

interface DataFlowRepository {
    fun queryFlow(
        userId: String,
        page: Int,
        perPage: Int
    ): Flow<Model>
}
