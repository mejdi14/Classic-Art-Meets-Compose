package com.bk.core.data.repository

import com.net.core.network.model.Artwork
import kotlinx.coroutines.flow.Flow

interface ArtworkRepository {
    fun getArtworkStream(): Flow<Result<Artwork>>
}