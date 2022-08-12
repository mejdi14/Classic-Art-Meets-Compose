package com.example.core.network.retrofit

import kotlinx.serialization.Serializable

@Serializable
data class NetworkResponse<T>(
    val data: T
)
