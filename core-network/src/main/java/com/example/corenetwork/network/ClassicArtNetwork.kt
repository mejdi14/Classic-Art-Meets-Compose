package com.example.corenetwork.network

import com.example.corenetwork.network.model.Agent
import com.example.corenetwork.network.model.Artwork
import com.example.corenetwork.network.model.Place
import kotlinx.coroutines.flow.Flow

interface ClassicArtNetwork {
    suspend fun getArtwork(): Artwork

    suspend fun getAgent(): Agent

    suspend fun getPlace(): Place
}
