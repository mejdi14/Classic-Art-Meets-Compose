package com.example.studioghiblimeetscompose.repositories

import com.example.core_network.network.GhibliNetwork
import com.example.core_network.network.model.Film
import javax.inject.Inject

class FilmRepository  @Inject constructor(
    private val network: GhibliNetwork
){

    suspend fun getAllFilms(): List<Film> {
        return network.getTopics()
    }
}