package com.bk.core.data.repository

import com.net.core.network.ClassicArtNetwork
import com.net.core.network.model.Agent
import javax.inject.Inject

class AgentRepository @Inject constructor(
    private val network: ClassicArtNetwork
) {

    suspend fun getAllAgents(): Agent {
        return network.getAgent()
    }
}
