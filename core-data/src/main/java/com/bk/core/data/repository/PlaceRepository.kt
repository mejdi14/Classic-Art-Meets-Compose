package com.bk.core.data.repository

import com.example.core.network.model.Place
import kotlinx.coroutines.flow.Flow

interface PlaceRepository {

    suspend fun getAllPlaces(): Place

    fun getPlacesStream(): Flow<Result<Place>>
}
