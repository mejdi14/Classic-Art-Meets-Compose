package com.example.core.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.classicartmeetscompose.ui.screen.GalleryRoute

object GalleryDestination : ClassicArtNavigationDestination {
    override val route = "gallery_route"
    override val destination = "gallery_destination"
}

fun NavGraphBuilder.galleryGraph() {
    composable(route = GalleryDestination.route) {
        GalleryRoute()
    }
}
