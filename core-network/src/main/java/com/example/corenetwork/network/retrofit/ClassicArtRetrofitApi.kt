package com.example.corenetwork.network.retrofit

import com.example.corenetwork.network.model.Artwork
import com.example.corenetwork.network.model.Data
import retrofit2.http.GET

interface ClassicArtRetrofitApi {
    @GET(value = "artworks")
    suspend fun getArtwork(): NetworkResponse<Artwork>
}
