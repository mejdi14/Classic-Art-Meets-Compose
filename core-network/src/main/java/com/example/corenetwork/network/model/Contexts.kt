package com.example.corenetwork.network.model

import kotlinx.serialization.Serializable

@Serializable
data class Contexts(

    var groupings: ArrayList<String> = arrayListOf()

)
