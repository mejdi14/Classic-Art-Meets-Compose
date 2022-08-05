package com.example.example

import com.google.gson.annotations.SerializedName


data class ExampleJson2KtKotlin (

  @SerializedName("data"   ) var data   : Data?   = Data(),
  @SerializedName("info"   ) var info   : Info?   = Info(),
  @SerializedName("config" ) var config : Config? = Config()

)