package com.example.corenetwork.network.retrofit

import kotlinx.serialization.Serializable

@Serializable
data class NetworkResponse<T>(
    val data: T
)