package com.example.corenetwork.network

import com.example.corenetwork.network.model.Artwork

interface ClassicArtNetwork {
    suspend fun getTopics(): Artwork
}
