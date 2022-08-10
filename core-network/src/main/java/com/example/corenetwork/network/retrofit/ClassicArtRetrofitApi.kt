package com.example.corenetwork.network.retrofit

import com.example.corenetwork.network.model.Agent
import com.example.corenetwork.network.model.Artwork
import com.example.corenetwork.network.model.Place
import retrofit2.http.GET

interface ClassicArtRetrofitApi {
    @GET(value = "artworks")
    suspend fun getALLArtworks(): Artwork

    @GET(value = "agents")
    suspend fun getAllAgents(): Agent

    @GET(value = "places")
    suspend fun getAllPlaces(): Place
}
