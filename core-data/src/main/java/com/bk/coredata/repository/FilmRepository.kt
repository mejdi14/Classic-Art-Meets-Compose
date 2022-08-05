package com.bk.coredata.repository

import com.example.corenetwork.network.ClassicArtNetwork
import com.example.corenetwork.network.model.Data
import javax.inject.Inject

class FilmRepository @Inject constructor(
    private val network: ClassicArtNetwork
) {

    suspend fun getAllFilms(): Data {
        return network.getTopics()
    }
}
