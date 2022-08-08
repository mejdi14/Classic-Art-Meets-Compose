package com.bk.coredata.viewmodel

import androidx.lifecycle.ViewModel
import com.bk.coredata.repository.ArtworkRepository
import com.example.corenetwork.network.model.Artwork
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class FilmViewModel @Inject constructor(
    private val artworkRepository: ArtworkRepository
) :
    ViewModel() {

    suspend fun getAllArtworks(): Artwork {
        return artworkRepository.getAllArtworks()
    }
}
