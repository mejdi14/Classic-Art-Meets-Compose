package com.bk.core.data.repository

import com.bk.core.data.ClassicArtDispatchers
import com.bk.core.data.Dispatcher
import com.net.core.network.ClassicArtNetwork
import com.net.core.network.model.Artwork
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class ArtworkRepositoryImp @Inject constructor(
    @Dispatcher(ClassicArtDispatchers.IO) private val ioDispatcher: CoroutineDispatcher,
    private val network: ClassicArtNetwork
) : ArtworkRepository {

    suspend fun getAllArtworks(): Artwork {
        return network.getArtwork()
    }

    override fun getArtworkStream(): Flow<Result<Artwork>> = flow {
        emit(Result.success(network.getArtwork()))
    }.flowOn(ioDispatcher)
}
