package com.bk.coredata.repository

import com.example.corenetwork.network.model.Place
import kotlinx.coroutines.flow.Flow

interface PlaceRepository {

    suspend fun getAllPlaces(): Place

    fun getPlacesStream(): Flow<Result<Place>>
}
