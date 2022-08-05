package com.example.corenetwork.network.model

import kotlinx.serialization.Serializable

@Serializable
data class Pagination(

    var total: Int? = null,
    var limit: Int? = null,
    var offset: Int? = null,
    var totalPages: Int? = null,
    var currentPage: Int? = null,
    var nextUrl: String? = null

)
