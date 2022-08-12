package com.example.classicartmeetscompose.ui.screen

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import com.example.core.navigation.TOP_LEVEL_DESTINATIONS
import com.example.core.navigation.TopLevelDestination

@Composable
fun ClassicArtBottomBar(onNavigateToTopLevelDestination: (TopLevelDestination) -> Unit, currentDestination: NavDestination?) {
    Surface(color = Color(0xFFFFFFFF)) {
        BottomAppBar(
            elevation = 0.dp
        ) {
            TOP_LEVEL_DESTINATIONS.forEach { destination ->
                val selected =
                    currentDestination?.hierarchy?.any { it.route == destination.route } == true
                BottomNavigationItem(
                    selected = selected,
                    onClick = { onNavigateToTopLevelDestination(destination) },
                    icon = {
                        Icon(
                            if (selected) {
                                destination.selectedIcon
                            } else {
                                destination.unselectedIcon
                            },
                            contentDescription = null
                        )
                    },
                    label = { Text(stringResource(destination.iconTextId)) }
                )
            }
        }
    }
}
