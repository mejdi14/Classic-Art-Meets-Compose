package com.bk.core.data.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bk.core.data.ClassicArtDispatchers
import com.bk.core.data.Dispatcher
import com.bk.core.data.DataUiState
import com.bk.core.data.repository.ArtworkRepositoryImp
import com.net.core.network.model.Artwork
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.*
import javax.inject.Inject
@HiltViewModel
class ArtworkViewModel @Inject constructor(
    @Dispatcher(ClassicArtDispatchers.IO) private val ioDispatcher: CoroutineDispatcher,
    private val artworkRepository: ArtworkRepositoryImp
) :
    ViewModel() {

    suspend fun getAllArtworks(): Artwork {
        return artworkRepository.getAllArtworks()
    }

    @ExperimentalCoroutinesApi
    val artworkUiState: StateFlow<DataUiState> =
        artworkRepository.getArtworkStream()
            .flatMapLatest {
                if (it.isSuccess) {
                    flowOf(DataUiState.Success(it.getOrThrow()))
                } else {
                    flowOf(DataUiState.Error)
                }
            }
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5_000),
                initialValue = DataUiState.Loading
            )
}
