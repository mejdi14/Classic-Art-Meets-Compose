package com.example.core_network.network.retrofit

import kotlinx.serialization.Serializable

@Serializable
data class NetworkResponse<T>(
    val data: T
)