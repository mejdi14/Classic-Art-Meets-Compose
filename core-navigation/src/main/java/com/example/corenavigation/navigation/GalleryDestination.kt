package com.example.corenavigation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

object GalleryDestination : NiaNavigationDestination {
    override val route = "for_you_route"
    override val destination = "for_you_destination"
}

fun NavGraphBuilder.forYouGraph(

) {
    composable(route = GalleryDestination.route) {
        ForYouRoute()
    }
}