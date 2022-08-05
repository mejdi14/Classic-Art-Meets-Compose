package com.example.classicartmeetscompose.di

import com.example.corenetwork.network.ClassicArtNetwork
import com.example.corenetwork.network.retrofit.ClassicArtRetrofitNetwork
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
    fun bindsNiaNetwork(niANetwork: ClassicArtRetrofitNetwork): ClassicArtNetwork

    companion object {
        @Provides
        @Singleton
        fun providesNetworkJson(): Json = Json {
            ignoreUnknownKeys = true
        }
    }
}
