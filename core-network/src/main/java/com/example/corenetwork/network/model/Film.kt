package com.example.corenetwork.network.model

import kotlinx.serialization.Serializable
@Serializable
data class Film(
    var id: String? = null,
    var title: String? = null,
    var originalTitle: String? = null,
    var originalTitleRomanised: String? = null,
    var image: String? = null,
    var movieBanner: String? = null,
    var description: String? = null,
    var director: String? = null,
    var producer: String? = null,
    var releaseDate: String? = null,
    var runningTime: String? = null,
    var rtScore: String? = null,
    var people: ArrayList<String> = arrayListOf(),
    var species: ArrayList<String> = arrayListOf(),
    var locations: ArrayList<String> = arrayListOf(),
    var vehicles: ArrayList<String> = arrayListOf(),
    var url: String? = null
)
