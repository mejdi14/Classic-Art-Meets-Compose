package com.bk.core.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.net.classicartmeetscompose.icons.selected.SelectedIcons
import com.net.classicartmeetscompose.icons.selected.myiconpack.Home
import com.net.classicartmeetscompose.icons.selected.myiconpack.Image
import com.net.classicartmeetscompose.icons.unselected.UnselectedIcons
import com.net.classicartmeetscompose.icons.unselected.myiconpack.Home
import com.net.classicartmeetscompose.icons.unselected.myiconpack.Image

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
        selectedIcon = SelectedIcons.Home,
        unselectedIcon = UnselectedIcons.Home
    ),
    TopLevelDestination(
        route = GalleryDestination.route,
        selectedIcon = SelectedIcons.Image,
        unselectedIcon = UnselectedIcons.Image
    )
)
