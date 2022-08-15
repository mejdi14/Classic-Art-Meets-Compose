package com.net.core.network.model

import AgentData
import kotlinx.serialization.Serializable

@Serializable
data class Agent(
    val pagination: Pagination? = Pagination(),
    val data: ArrayList<AgentData> = arrayListOf(),
    val info: Info = Info(),
    val config: Config = Config()
)
