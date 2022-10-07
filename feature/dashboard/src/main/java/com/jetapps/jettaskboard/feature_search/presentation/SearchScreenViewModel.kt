package com.jetapps.jettaskboard.feature_search.presentation

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.ViewModel
import com.jetapps.jettaskboard.feature_search.data.SearchType
import com.jetapps.jettaskboard.feature_search.data.getAllSearchType
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchScreenViewModel @Inject constructor() : ViewModel() {

    var inputValue = mutableStateOf(TextFieldValue())

    fun searchAtDB(query : String){
        // Do Nothing
    }

    fun getAllDefaultSearchOptions() = getAllSearchType()
}