package com.bk.coredata.repository

import com.example.corenetwork.network.ClassicArtNetwork
import com.example.corenetwork.network.model.Place
import javax.inject.Inject

class PlaceRepository @Inject constructor(
    private val network: ClassicArtNetwork
) {

    suspend fun getAllPlaces(): Place {
        return network.getPlace()
    }
}
