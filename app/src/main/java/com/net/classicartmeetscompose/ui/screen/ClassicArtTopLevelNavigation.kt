package com.bk.core.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.net.classicartmeetscompose.ui.screen.HomeIcon
import com.net.classicartmeetscompose.unselected.icons.MyIconPack
import com.net.classicartmeetscompose.unselected.icons.myiconpack.Home

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
    val unselectedIcon: ImageVector,
)

val TOP_LEVEL_DESTINATIONS = listOf(
    TopLevelDestination(
        route = HomeDestination.route,
        selectedIcon = HomeIcon ,
        unselectedIcon = MyIconPack.Home,
    ),
    TopLevelDestination(
        route = GalleryDestination.route,
        selectedIcon =  HomeIcon ,
        unselectedIcon = Icons.Outlined.Menu,
    )
)
