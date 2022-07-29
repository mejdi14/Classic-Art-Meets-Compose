package com.example.studio_ghibli_meets_compose.di

import com.example.core_network.network.GhibliNetwork
import com.example.core_network.network.retrofit.RetrofitGhibliNetwork
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import kotlinx.serialization.json.Json

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {
    @Binds
    fun bindsNiaNetwork(
        niANetwork: RetrofitGhibliNetwork
    ): GhibliNetwork

    companion object {
        @Provides
        @Singleton
        fun providesNetworkJson(): Json = Json {
            ignoreUnknownKeys = true
        }
    }
}