package com.net.core.network.model

import kotlinx.serialization.Serializable

@Serializable
data class Config(

    var iiifUrl: String? = null,
    var websiteUrl: String? = null

)
