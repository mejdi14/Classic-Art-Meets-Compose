package com.example.corenetwork.network.retrofit

import com.example.corenetwork.network.model.Artwork
import com.example.corenetwork.network.model.Film
import retrofit2.http.GET

interface ClassicArtRetrofitApi {
    @GET(value = "artworks")
    suspend fun getFilms(): NetworkResponse<Artwork>
}
