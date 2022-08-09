package com.bk.coredata.repository

import com.bk.coredata.ClassicArtDispatchers
import com.bk.coredata.Dispatcher
import com.example.corenetwork.network.ClassicArtNetwork
import com.example.corenetwork.network.model.Place
import com.example.corenetwork.network.model.PlaceData
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class PlaceRepository @Inject constructor(
    @Dispatcher(ClassicArtDispatchers.IO) private val ioDispatcher: CoroutineDispatcher,
    private val network: ClassicArtNetwork
) {

    suspend fun getAllPlaces(): Place {
        return network.getPlace()
    }

    fun getPlacesStream(): Flow<Result<List<PlaceData>>> = flow {
        emit(Result.success(network.getPlace().data))
    }.flowOn(ioDispatcher)
}
