package com.bk.coredata.repository

import com.example.corenetwork.network.ClassicArtNetwork
import com.example.corenetwork.network.model.Data
import javax.inject.Inject

class ArtworkRepository @Inject constructor(
    private val network: ClassicArtNetwork
) {

    suspend fun getAllArtworks(): Data {
        return network.getTopics()
    }
}
