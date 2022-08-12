package com.example.core.network.retrofit

import com.example.core.network.model.Agent
import com.example.core.network.model.Artwork
import com.example.core.network.model.Place
import retrofit2.http.GET

interface ClassicArtRetrofitApi {
    @GET(value = "artworks")
    suspend fun getALLArtworks(): Artwork

    @GET(value = "agents")
    suspend fun getAllAgents(): Agent

    @GET(value = "places")
    suspend fun getAllPlaces(): Place
}
