package com.bk.coredata.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.bk.coredata.repository.FilmRepository
import com.example.corenetwork.network.model.Data
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