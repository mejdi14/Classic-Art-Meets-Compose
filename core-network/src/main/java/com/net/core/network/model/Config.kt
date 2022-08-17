package com.net.core.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Config(

    @SerialName("iiif_url") var iiifUrl: String? = null,
    @SerialName("website_url") var websiteUrl: String? = null

)
