package com.bk.core.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.net.classicartmeetscompose.icons.unselected.UnselectedIcons
import com.net.classicartmeetscompose.icons.unselected.myiconpack.Home
import com.net.classicartmeetscompose.ui.screen.HomeIcon

class ClassicArtTopLevelNavigation(private val navController: NavHostController) {

    fun navigateTo(destination: TopLevelDestination) {
        navController.navigate(destination.route) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }
}

data class TopLevelDestination(
    val route: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector
)

val TOP_LEVEL_DESTINATIONS = listOf(
    TopLevelDestination(
        route = HomeDestination.route,
        selectedIcon = HomeIcon,
        unselectedIcon = UnselectedIcons.Home
    ),
    TopLevelDestination(
        route = GalleryDestination.route,
        selectedIcon = HomeIcon,
        unselectedIcon = Icons.Outlined.Menu
    )
)
