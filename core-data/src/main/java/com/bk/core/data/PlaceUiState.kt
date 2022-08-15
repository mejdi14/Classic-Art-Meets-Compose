package com.bk.core.data

import com.net.core.network.model.Place

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
