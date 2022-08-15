package com.net.classicartmeetscompose.ui.screen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.net.classicartmeetscompose.ui.theme.ClassicArtComposeTheme

@Composable
fun MainScreen() {
    ClassicArtComposeTheme {
        val navController = rememberNavController()
        val classicArtTopLevelNavigation = remember(navController) {
            ClassicArtTopLevelNavigation(navController)
        }
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination

        Scaffold(
            modifier = Modifier,
            bottomBar = {
                ClassicArtBottomBar(
                    onNavigateToTopLevelDestination = classicArtTopLevelNavigation::navigateTo,
                    currentDestination = currentDestination
                )
            }
        ) { padding ->
            Row(
                Modifier
                    .fillMaxSize()

            ) {
                ClassicArtNavigationHost(
                    navController = navController,
                    modifier = Modifier
                        .padding(padding)
                )
            }
        }

    }
}
