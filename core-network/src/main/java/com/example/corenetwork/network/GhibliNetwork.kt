package com.example.corenetwork.network

import com.example.corenetwork.network.model.Film

interface GhibliNetwork {
    suspend fun getTopics(): List<Film>
}