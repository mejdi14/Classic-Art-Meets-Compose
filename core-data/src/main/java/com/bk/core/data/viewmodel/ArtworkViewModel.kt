package com.bk.core.data.viewmodel

import androidx.lifecycle.ViewModel
import com.bk.core.data.repository.ArtworkRepository
import com.example.core.network.model.Artwork
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class ArtworkViewModel @Inject constructor(
    private val artworkRepository: ArtworkRepository
) :
    ViewModel() {

    suspend fun getAllArtworks(): Artwork {
        return artworkRepository.getAllArtworks()
    }
}
