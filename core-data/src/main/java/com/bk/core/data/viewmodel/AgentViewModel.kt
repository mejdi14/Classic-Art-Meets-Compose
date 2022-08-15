package com.bk.core.data.viewmodel

import androidx.lifecycle.ViewModel
import com.bk.core.data.repository.AgentRepository
import com.net.core.network.model.Agent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AgentViewModel @Inject constructor(
    private val agentRepository: AgentRepository
) :
    ViewModel() {

    suspend fun getAllAgents(): Agent {
        return agentRepository.getAllAgents()
    }
}
