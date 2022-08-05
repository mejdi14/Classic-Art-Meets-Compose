package com.example.corenetwork.network.model

import kotlinx.serialization.Serializable
@Serializable
data class Artwork(
    var data: Data? = Data(),
    var info: Info? = Info(),
    var config: Config? = Config()
)
