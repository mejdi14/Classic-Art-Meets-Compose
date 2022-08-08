package com.bk.coredata.repository

import com.example.corenetwork.network.ClassicArtNetwork
import com.example.corenetwork.network.model.Agent
import com.example.corenetwork.network.model.Artwork
import javax.inject.Inject

class AgentRepository @Inject constructor(
    private val network: ClassicArtNetwork
) {

    suspend fun getAllAgents(): Agent {
        return network.getAgent()
    }
}