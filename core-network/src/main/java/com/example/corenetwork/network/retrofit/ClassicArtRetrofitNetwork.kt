package com.example.corenetwork.network.retrofit

import com.example.corenetwork.BuildConfig
import com.example.corenetwork.network.ClassicArtNetwork
import com.example.corenetwork.network.model.Artwork
import com.example.corenetwork.network.model.Film
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
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
    override suspend fun getTopics(): Artwork {
        return networkApi.getFilms().data
    }

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
