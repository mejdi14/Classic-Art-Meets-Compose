package com.example.studio_ghibli_meets_compose.di

import com.example.core_network.network.GhibliNetwork
import com.example.core_network.network.retrofit.RetrofitGhibliNetwork
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {
    @Binds
    fun bindsNiaNetwork(
        niANetwork: RetrofitGhibliNetwork
    ): GhibliNetwork
}