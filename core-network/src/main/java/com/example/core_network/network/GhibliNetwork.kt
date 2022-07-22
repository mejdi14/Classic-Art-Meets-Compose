package com.example.core_network.network

import com.example.core_network.network.model.Film

interface GhibliNetwork {
    suspend fun getTopics(ids: List<String>? = null): List<Film>
}