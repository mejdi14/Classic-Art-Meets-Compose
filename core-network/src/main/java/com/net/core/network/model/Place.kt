package com.net.core.network.model

import kotlinx.serialization.Serializable

@Serializable
data class Place(
    val pagination: Pagination? = Pagination(),
    val data: ArrayList<PlaceData> = arrayListOf(),
    val info: Info = Info(),
    val config: Config = Config()
)
