package com.example.corenetwork.network.model

import kotlinx.serialization.Serializable

@Serializable
data class Info(

    var licenseText: String? = null,
    var licenseLinks: ArrayList<String> = arrayListOf(),
    var version: String? = null

)
