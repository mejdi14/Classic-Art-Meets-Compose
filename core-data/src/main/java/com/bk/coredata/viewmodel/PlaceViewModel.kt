package com.bk.coredata.viewmodel

import androidx.lifecycle.ViewModel
import com.bk.coredata.repository.PlaceRepository
import com.example.corenetwork.network.model.Place
import com.example.corenetwork.network.model.PlaceData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@HiltViewModel
class PlaceViewModel @Inject constructor(
    private val placeRepository: PlaceRepository
) :
    ViewModel() {

    suspend fun getAllPlaces(): Place {
        return placeRepository.getAllPlaces()
    }

    private val getPlacesStream: Flow<List<PlaceData>> = flow {
        emit(placeRepository.getAllPlaces().data)
    }
}
