package com.bk.core.data.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bk.core.data.ClassicArtDispatchers
import com.bk.core.data.Dispatcher
import com.bk.core.data.PlaceUiState
import com.bk.core.data.repository.PlaceRepository
import com.net.core.network.model.Place
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.*
import javax.inject.Inject

@HiltViewModel
class PlaceViewModel @Inject constructor(
    @Dispatcher(ClassicArtDispatchers.IO) private val ioDispatcher: CoroutineDispatcher,
    private val placeRepository: PlaceRepository
) :
    ViewModel() {

    suspend fun getAllPlaces(): Place {
        return placeRepository.getAllPlaces()
    }

    @ExperimentalCoroutinesApi
    val placesUiState: StateFlow<PlaceUiState> =
        placeRepository.getPlacesStream()
            .flatMapLatest {
                if (it.isSuccess) {
                    Log.d("TAG", "success: ${it.getOrNull()}")
                    flowOf(PlaceUiState.Success(it.getOrThrow()))
                } else {
                    flowOf(PlaceUiState.Error)
                }
            }
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5_000),
                initialValue = PlaceUiState.Loading
            )
}
