package com.example.corenetwork.network.model

import kotlinx.serialization.Serializable

@Serializable
data class Thumbnail(

    var lqip: String? = null,
    var width: Int? = null,
    var height: Int? = null,
    var altText: String? = null

)