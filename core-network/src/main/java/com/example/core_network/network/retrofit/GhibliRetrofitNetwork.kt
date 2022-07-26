package com.example.core_network.network.retrofit

import com.example.core_network.BuildConfig
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
class RetrofitGhibliNetwork @Inject constructor(
    networkJson: Json
) : GhibliNetwork {
    override suspend fun getTopics(ids: List<String>?): List<Film> {
        TODO("Not yet implemented")
    }

    private val networkApi = Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .client(
            OkHttpClient.Builder()
                .addInterceptor(
                    // TODO: Decide logging logic
                    HttpLoggingInterceptor().apply {
                        setLevel(HttpLoggingInterceptor.Level.BODY)
                    }
                )
                .build()
        )
        .addConverterFactory(networkJson.asConverterFactory("application/json".toMediaType()))
        .build()
        .create(RetrofitGhibliNetwork::class.java)
}