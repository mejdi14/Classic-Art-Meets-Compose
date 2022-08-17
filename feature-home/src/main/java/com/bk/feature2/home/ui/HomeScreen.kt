package com.bk.feature2.home.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import com.bk.core.data.viewmodel.ArtworkViewModel

@Composable
fun HomeRoute() {
    HomeScreen()
}

@Composable
fun HomeScreen(
    viewModel: ArtworkViewModel = hiltViewModel()
) {
    val navController = rememberNavController()
    val artworkUiState by viewModel.artworkUiState.collectAsState()
    Text(text = "hello from home", modifier = Modifier.fillMaxSize())
}
