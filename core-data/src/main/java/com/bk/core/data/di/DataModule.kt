package com.example.classicartmeetscompose.di

import com.bk.core.data.repository.PlaceRepository
import com.bk.core.data.repository.PlaceRepositoryImpl
import com.example.core.network.ClassicArtNetwork
import com.example.core.network.retrofit.ClassicArtRetrofitNetwork
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
    fun bindsClassicArtNetwork(niANetwork: ClassicArtRetrofitNetwork): ClassicArtNetwork

    companion object {
        @Provides
        @Singleton
        fun providesNetworkJson(): Json = Json {
            ignoreUnknownKeys = true
        }
    }

    @Binds
    fun bindsPlaceRepository(placeRepositoryImpl: PlaceRepositoryImpl): PlaceRepository
}
