package com.example.corenetwork.network.retrofit

import com.example.corenetwork.network.model.Agent
import com.example.corenetwork.network.model.Artwork
import com.example.corenetwork.network.model.Place
import retrofit2.http.GET

interface ClassicArtRetrofitApi {
    @GET(value = "artworks")
    suspend fun getALLArtworks(): NetworkResponse<Artwork>

    @GET(value = "agents")
    suspend fun getAllAgents(): NetworkResponse<Agent>

    @GET(value = "places")
    suspend fun getAllPlaces(): NetworkResponse<Place>
}
