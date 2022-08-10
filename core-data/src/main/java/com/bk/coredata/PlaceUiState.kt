package com.bk.coredata

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
        val feed: List<PlaceData>
    ) : PlaceUiState
}