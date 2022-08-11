package com.example.classicartmeetscompose.ui.screen

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.classicartmeetscompose.ui.theme.ClassicArtComposeTheme

@Composable
fun GalleryRoute(){
    GalleryScreen()
}


@Composable
fun GalleryScreen() {
    ClassicArtComposeTheme {
        val navController = rememberNavController()
    }
}