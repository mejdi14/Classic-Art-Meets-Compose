package com.net.core.network

import com.net.core.network.model.Agent
import com.net.core.network.model.Artwork
import com.net.core.network.model.Place

interface ClassicArtNetwork {
    suspend fun getArtwork(): Artwork

    suspend fun getAgent(): Agent

    suspend fun getPlace(): Place
}
