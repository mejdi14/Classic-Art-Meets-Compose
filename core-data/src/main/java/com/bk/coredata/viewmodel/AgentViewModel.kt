package com.bk.coredata.viewmodel

import androidx.lifecycle.ViewModel
import com.bk.coredata.repository.AgentRepository
import com.example.corenetwork.network.model.Agent
import javax.inject.Inject

class AgentViewModel @Inject constructor(
    private val agentRepository: AgentRepository
) :
    ViewModel() {

    suspend fun getAllAgents(): Agent {
        return agentRepository.getAllAgents()
    }
}
