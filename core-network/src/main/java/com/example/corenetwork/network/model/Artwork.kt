package com.example.corenetwork.network.model

class Artwork {
    @SerializedName("data"   ) var data   : Data?   = Data(),
    @SerializedName("info"   ) var info   : Info?   = Info(),
    @SerializedName("config" ) var config : Config? = Config()
}