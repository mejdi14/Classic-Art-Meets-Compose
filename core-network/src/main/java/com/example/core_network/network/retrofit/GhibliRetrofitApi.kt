package com.example.core_network.network.retrofit

import com.example.core_network.network.model.Film
import retrofit2.http.GET
import retrofit2.http.Query

interface GhibliRetrofitApi {
    @GET(value = "topics")
    suspend fun getFilms(
        @Query("id") ids: List<String>?,
    ): NetworkResponse<List<Film>>
}