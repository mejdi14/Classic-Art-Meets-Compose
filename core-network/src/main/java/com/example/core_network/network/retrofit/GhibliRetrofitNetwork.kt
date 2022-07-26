package com.example.core_network.network.retrofit

import com.example.core_network.network.GhibliNetwork
import kotlinx.serialization.json.Json
import javax.inject.Inject
import javax.inject.Singleton

/**
 * [Retrofit] backed [NiaNetwork]
 */
@Singleton
class RetrofitNiaNetwork @Inject constructor(
    networkJson: Json
) : GhibliNetwork {

    private val networkApi = Retrofit.Builder()
        .baseUrl(NiaBaseUrl)
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
        .create(RetrofitNiaNetworkApi::class.java)

    override suspend fun getTopics(ids: List<String>?): List<NetworkTopic> =
        networkApi.getTopics(ids = ids).data

    override suspend fun getAuthors(ids: List<String>?): List<NetworkAuthor> =
        networkApi.getAuthors(ids = ids).data

    override suspend fun getNewsResources(ids: List<String>?): List<NetworkNewsResource> =
        networkApi.getNewsResources(ids = ids).data

    override suspend fun getTopicChangeList(after: Int?): List<NetworkChangeList> =
        networkApi.getTopicChangeList(after = after)

    override suspend fun getAuthorChangeList(after: Int?): List<NetworkChangeList> =
        networkApi.getAuthorsChangeList(after = after)

    override suspend fun getNewsResourceChangeList(after: Int?): List<NetworkChangeList> =
        networkApi.getNewsResourcesChangeList(after = after)
}