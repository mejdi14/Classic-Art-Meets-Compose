package com.example.corenetwork.network

import com.example.corenetwork.network.model.Agent
import com.example.corenetwork.network.model.Artwork

interface ClassicArtNetwork {
    suspend fun getArtwork(): Artwork

    suspend fun getAgent(): Agent
}
