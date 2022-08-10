package com.bk.coredata

import com.example.corenetwork.network.model.Config
import com.example.corenetwork.network.model.Place
import com.example.corenetwork.network.model.PlaceData

sealed interface PlaceUiState {
    /**
     * The feed is still loading.
     */
    object Loading : PlaceUiState

    object Error : PlaceUiState

    /**
     * The feed is loaded with the given list of news resources.
     */
    data class Success(
        val feed: Place
    ) : PlaceUiState
}
