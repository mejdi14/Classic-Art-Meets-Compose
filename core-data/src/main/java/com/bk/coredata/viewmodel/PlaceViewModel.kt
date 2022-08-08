package com.bk.coredata.viewmodel

import androidx.lifecycle.ViewModel
import com.bk.coredata.repository.PlaceRepository
import com.example.corenetwork.network.model.Place
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PlaceViewModel @Inject constructor(
    private val placeRepository: PlaceRepository
) :
    ViewModel() {

    suspend fun getAllPlaces(): Place {
        return placeRepository.getAllPlaces()
    }
}