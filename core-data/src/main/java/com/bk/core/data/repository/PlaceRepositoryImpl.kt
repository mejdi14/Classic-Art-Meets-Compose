package com.bk.core.data.repository

import com.bk.core.data.ClassicArtDispatchers
import com.bk.core.data.Dispatcher
import com.example.core.network.ClassicArtNetwork
import com.example.core.network.model.Place
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class PlaceRepositoryImpl @Inject constructor(
    @Dispatcher(ClassicArtDispatchers.IO) private val ioDispatcher: CoroutineDispatcher,
    private val network: ClassicArtNetwork
) : PlaceRepository {

    override suspend fun getAllPlaces(): Place {
        return network.getPlace()
    }

    override fun getPlacesStream(): Flow<Result<Place>> = flow {
        emit(Result.success(network.getPlace()))
    }.flowOn(ioDispatcher)
}
