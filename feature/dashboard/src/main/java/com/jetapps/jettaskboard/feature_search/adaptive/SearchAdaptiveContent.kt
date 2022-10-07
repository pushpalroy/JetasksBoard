package com.jetapps.jettaskboard.feature_search.adaptive

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.jetapps.jettaskboard.feature_search.data.SearchType
import com.jetapps.jettaskboard.feature_search.presentation.SearchScreenViewModel

@Composable
fun SearchAdaptiveContent(
    isScreenExpanded : Boolean = false,
    viewModel : SearchScreenViewModel,
    navigateUp : () -> Unit,
) {
    val selectSearchType: MutableState<SearchType?> = remember {
        mutableStateOf(SearchType.BOARD_TYPE)
    }

    if (!isScreenExpanded){
        SearchSinglePaneContent(
            viewModel = viewModel,
            navigateToBoardScreen = {},
            selectSearchType = selectSearchType,
            navigateToCardScreen = {}
        )
    }else{
        SearchDoublePaneContent(
            viewModel = viewModel,
            navigateToBoardScreen = {},
            selectSearchType = selectSearchType,
            navigateToCardScreen = {},
            navigateUp = navigateUp
        )
    }
}