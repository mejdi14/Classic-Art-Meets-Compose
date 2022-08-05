package com.example.corenetwork.network.retrofit

import com.example.corenetwork.network.model.Data
import retrofit2.http.GET

interface ClassicArtRetrofitApi {
    @GET(value = "artworks/4")
    suspend fun getFilms(): NetworkResponse<Data>
}
