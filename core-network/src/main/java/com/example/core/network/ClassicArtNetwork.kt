package com.example.core.network

import com.example.core.network.model.Agent
import com.example.core.network.model.Artwork
import com.example.core.network.model.Place

interface ClassicArtNetwork {
    suspend fun getArtwork(): Artwork

    suspend fun getAgent(): Agent

    suspend fun getPlace(): Place
}
