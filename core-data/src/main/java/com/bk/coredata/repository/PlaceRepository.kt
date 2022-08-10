package com.bk.coredata.repository

import com.bk.coredata.ClassicArtDispatchers
import com.bk.coredata.Dispatcher
import com.example.corenetwork.network.ClassicArtNetwork
import com.example.corenetwork.network.model.Config
import com.example.corenetwork.network.model.Place
import com.example.corenetwork.network.model.PlaceData
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

interface PlaceRepository {

    suspend fun getAllPlaces(): Place

    fun getPlacesStream(): Flow<Result<Place>>
}
