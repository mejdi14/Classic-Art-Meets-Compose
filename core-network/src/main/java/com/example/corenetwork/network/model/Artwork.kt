package com.example.corenetwork.network.model

import kotlinx.serialization.Serializable
import java.util.*

@Serializable
data class Artwork(
    var pagination: Pagination? = Pagination(),
    var data: ArrayList<Data> = arrayListOf(),
    var info: Info? = Info(),
    var config: Config? = Config()
)
