package com.example.studio_ghibli_meets_compose.repositories

import com.example.core_network.network.GhibliNetwork
import javax.inject.Inject

class FilmRepository  @Inject constructor(
    private val network: GhibliNetwork
){
}