package com.example.corenetwork.network

import com.example.corenetwork.network.model.Artwork
import com.example.corenetwork.network.model.Data

interface ClassicArtNetwork {
    suspend fun getArtwork(): Artwork
}
