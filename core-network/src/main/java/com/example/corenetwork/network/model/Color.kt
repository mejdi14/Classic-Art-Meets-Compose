package com.example.example

import kotlinx.serialization.Serializable

@Serializable
data class Color(
    var h: Int? = null,
    var l: Int? = null,
    var s: Int? = null,
    var percentage: Double? = null,
    var population: Int? = null
)