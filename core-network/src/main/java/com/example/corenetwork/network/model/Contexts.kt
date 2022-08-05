package com.example.example

import com.google.gson.annotations.SerializedName


data class Contexts (

  @SerializedName("groupings" ) var groupings : ArrayList<String> = arrayListOf()

)