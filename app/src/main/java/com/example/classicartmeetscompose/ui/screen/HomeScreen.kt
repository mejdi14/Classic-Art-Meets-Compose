package com.example.classicartmeetscompose.ui.screen

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.classicartmeetscompose.ui.theme.ClassicArtComposeTheme

@Composable
fun HomeScreen() {
    ClassicArtComposeTheme{
        val navController = rememberNavController()
    }
}