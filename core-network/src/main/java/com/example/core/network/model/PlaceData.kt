package com.example.core.network.model

import kotlinx.serialization.Serializable

@Serializable
data class PlaceData(

    var id: Int? = null,
    var apiModel: String? = null,
    var apiLink: String? = null,
    var title: String? = null,
    var type: String? = null,
    var tgnId: String? = null,
    var lastUpdatedSource: String? = null,
    var lastUpdated: String? = null,
    var timestamp: String? = null

)
