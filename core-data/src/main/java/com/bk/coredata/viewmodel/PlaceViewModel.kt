package com.bk.coredata.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bk.coredata.ClassicArtDispatchers
import com.bk.coredata.Dispatcher
import com.bk.coredata.PlaceUiState
import com.bk.coredata.repository.PlaceRepository
import com.example.corenetwork.network.model.Place
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
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

    val whatsAppUserState: StateFlow<PlaceUiState> =
        placeRepository.getPlacesStream()
            .flatMapLatest {
                if (it.isSuccess) {
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
