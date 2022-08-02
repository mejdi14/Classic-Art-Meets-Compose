package com.example.corenetwork.network.retrofit

import com.example.corenetwork.network.model.Film
import retrofit2.http.GET

interface GhibliRetrofitApi {
    @GET(value = "films")
    suspend fun getFilms(
    ): NetworkResponse<List<Film>>
}
