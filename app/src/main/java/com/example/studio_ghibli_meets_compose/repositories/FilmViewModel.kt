package com.example.studio_ghibli_meets_compose.repositories

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
        return filmRepository.getAllFilms()
    }
}