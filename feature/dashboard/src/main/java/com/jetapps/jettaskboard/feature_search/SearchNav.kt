package com.jetapps.jettaskboard.feature_search

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.jetapps.jettaskboard.JtbNavDestination
import com.jetapps.jettaskboard.feature_search.presentation.SearchRoute

object SearchDestination : JtbNavDestination {
    override val route = "search_route"
    override val destination = "search_destination"
}

fun NavGraphBuilder.searchGraph(isExpandedScreen: Boolean, onBackClick: () -> Unit) {
    composable(route = SearchDestination.route) {
        SearchRoute(
            isExpandedScreen = isExpandedScreen,
            onNavigateUp = onBackClick,
            navigateToCardScreen = {},
            navigateToBoardScreen = {}
        )
    }
    composable(route = SearchDestination.route) {
        SearchRoute(
            isExpandedScreen = isExpandedScreen,
            onNavigateUp = onBackClick,
            navigateToCardScreen = {},
            navigateToBoardScreen = {}
        )
    }
}