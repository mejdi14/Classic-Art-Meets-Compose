package com.net.core.network.retrofit

import com.net.core.BuildConfig
import com.net.core.network.ClassicArtNetwork
import com.net.core.network.model.Agent
import com.net.core.network.model.Artwork
import com.net.core.network.model.Place
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ClassicArtRetrofitNetwork @Inject constructor(
    networkJson: Json
) : ClassicArtNetwork {
    override suspend fun getArtwork(): Artwork {
        return networkApi.getALLArtworks()
    }

    override suspend fun getAgent(): Agent {
        return networkApi.getAllAgents()
    }

    override suspend fun getPlace(): Place {
        return networkApi.getAllPlaces()
    }

    @Suppress("EXPERIMENTAL_IS_NOT_ENABLED")
    @OptIn(ExperimentalSerializationApi::class)
    private val networkApi = Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .client(
            OkHttpClient.Builder()
                .addInterceptor(
                    HttpLoggingInterceptor().apply {
                        setLevel(HttpLoggingInterceptor.Level.BODY)
                    }
                )
                .build()
        )
        .addConverterFactory(networkJson.asConverterFactory("application/json".toMediaType()))
        .build()
        .create(ClassicArtRetrofitApi::class.java)
}
