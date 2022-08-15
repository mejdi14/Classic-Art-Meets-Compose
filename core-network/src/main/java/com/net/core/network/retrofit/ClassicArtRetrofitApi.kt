package com.net.core.network.retrofit

import com.net.core.network.model.Agent
import com.net.core.network.model.Artwork
import com.net.core.network.model.Place
import retrofit2.http.GET

interface ClassicArtRetrofitApi {
    @GET(value = "artworks")
    suspend fun getALLArtworks(): Artwork

    @GET(value = "agents")
    suspend fun getAllAgents(): Agent

    @GET(value = "places")
    suspend fun getAllPlaces(): Place
}
