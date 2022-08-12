package com.example.classicartmeetscompose.ui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.classicartmeetscompose.ui.theme.ClassicArtComposeTheme

@Composable
fun HomeRoute() {
    HomeScreen()
}

@Composable
fun HomeScreen() {
    ClassicArtComposeTheme {
        val navController = rememberNavController()

        Text(text = "hello from home", modifier = Modifier.fillMaxSize())
    }
}
