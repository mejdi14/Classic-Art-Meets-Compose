package com.bk.core.data.repository

import com.net.core.network.ClassicArtNetwork
import com.net.core.network.model.Artwork
import javax.inject.Inject

class ArtworkRepository @Inject constructor(
    private val network: ClassicArtNetwork
) {

    suspend fun getAllArtworks(): Artwork {
        return network.getArtwork()
    }
}
