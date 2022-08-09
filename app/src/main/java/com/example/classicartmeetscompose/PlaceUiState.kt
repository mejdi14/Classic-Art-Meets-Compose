package com.example.classicartmeetscompose

import com.example.corenetwork.network.model.Place

sealed interface PlaceUiState {
    /**
     * The feed is still loading.
     */
    object Loading : PlaceUiState

    /**
     * The feed is loaded with the given list of news resources.
     */
    data class Success(
        val feed: List<Place>
    ) : PlaceUiState
}