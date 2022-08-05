package com.example.corenetwork.network

import com.example.corenetwork.network.model.Data

interface ClassicArtNetwork {
    suspend fun getTopics(): Data
}
