package com.example.corenetwork.network.model

import kotlinx.serialization.Serializable

@Serializable
data class SuggestAutocompleteAll(

    var input: ArrayList<String> = arrayListOf(),
    var contexts: Contexts? = Contexts()

)