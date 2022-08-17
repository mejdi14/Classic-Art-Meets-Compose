package com.bk.core.data.viewmodel

import androidx.lifecycle.ViewModel
import com.bk.core.data.repository.ArtworkRepositoryImp
import com.net.core.network.model.Artwork
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class ArtworkViewModel @Inject constructor(
    private val artworkRepository: ArtworkRepositoryImp
) :
    ViewModel() {

    suspend fun getAllArtworks(): Artwork {
        return artworkRepository.getAllArtworks()
    }
}
