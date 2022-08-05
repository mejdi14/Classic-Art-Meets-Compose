package com.example.classicartmeetscompose.repositories

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.corenetwork.network.model.Artwork
import com.example.corenetwork.network.model.Data
import com.example.corenetwork.network.model.Film
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class FilmViewModel @Inject constructor(
    private val filmRepository: FilmRepository
) :
    ViewModel() {

    suspend fun getAllFilms(): Data {
        val list = filmRepository.getAllFilms()
        Log.d("TAG", "getAllFilms: $list")
        return list
    }
}
