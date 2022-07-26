package com.example.core_network.network.retrofit

import com.example.core_network.network.GhibliNetwork
import com.example.core_network.network.model.Film
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

/**
 * [Retrofit] backed [NiaNetwork]
 */
@Singleton
class RetrofitNiaNetwork @Inject constructor(
    networkJson: Json
) : GhibliNetwork {
    override suspend fun getTopics(ids: List<String>?): List<Film> {
        TODO("Not yet implemented")
    }


}