package com.bk.core.data

import com.net.core.network.model.Place

sealed interface DataUiState {
    /**
     * The feed is still loading.
     */
    object Loading : DataUiState

    object Error : DataUiState

    /**
     * The feed is loaded with the given list of news resources.
     */
    data class Success<T>(
        val feed: T
    ) : DataUiState
}
