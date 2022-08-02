package com.example.studioghiblimeetscompose.di

import com.example.corenetwork.network.GhibliNetwork
import com.example.corenetwork.network.retrofit.GhibliRetrofitNetwork
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
    fun bindsNiaNetwork(niANetwork: GhibliRetrofitNetwork): GhibliNetwork

    companion object {
        @Provides
        @Singleton
        fun providesNetworkJson(): Json = Json {
            ignoreUnknownKeys = true
        }
    }
}
