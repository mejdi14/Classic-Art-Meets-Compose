package com.bk.feature2.home.ui

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.bk.core.data.DataUiState
import com.bk.core.data.viewmodel.ArtworkViewModel
import com.net.core.network.model.Artwork

@Composable
fun HomeRoute() {
    HomeScreen()
}

@Composable
fun HomeScreen(viewModel: ArtworkViewModel = hiltViewModel()) {
    val artworkUiState by viewModel.artworkUiState.collectAsState()
    LazyColumn(modifier = Modifier.fillMaxHeight()) {
        items(
            items = if (artworkUiState is DataUiState.Success<*>) {
                @Suppress("UNCHECKED_CAST")
                (artworkUiState as DataUiState.Success<Artwork>).feed.data
            } else arrayListOf(),
            itemContent = { item ->
                Text(text = item.title.toString())
            }
        )
    }
}
