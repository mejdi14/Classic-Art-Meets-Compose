package com.example.classicartmeetscompose.repositories

import com.example.corenetwork.network.ClassicArtNetwork
import com.example.corenetwork.network.model.Artwork
import com.example.corenetwork.network.model.Data
import com.example.corenetwork.network.model.Film
import javax.inject.Inject

class FilmRepository @Inject constructor(
    private val network: ClassicArtNetwork
) {

    suspend fun getAllFilms(): Data {
        return network.getTopics()
    }
}
