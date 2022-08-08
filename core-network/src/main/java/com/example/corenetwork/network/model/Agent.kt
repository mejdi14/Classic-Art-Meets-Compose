package com.example.corenetwork.network.model

import AgentData
import kotlinx.serialization.Serializable

@Serializable
data class Agent(
    val data: AgentData? = AgentData(),
    val info: Info,
    val config: Config
)
