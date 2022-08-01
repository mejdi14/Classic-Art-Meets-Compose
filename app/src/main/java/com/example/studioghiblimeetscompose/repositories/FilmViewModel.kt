package com.example.studioghiblimeetscompose.repositories

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.core_network.network.model.Film
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class FilmViewModel @Inject constructor(
    private val filmRepository: FilmRepository
) :
    ViewModel() {

    suspend fun getAllFilms(): List<Film> {
        val list = filmRepository.getAllFilms()
        Log.d("TAG", "getAllFilms: $list")
        return list
    }
}