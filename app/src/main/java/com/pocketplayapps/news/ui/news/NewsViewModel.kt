package com.pocketplayapps.news.ui.news

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pocketplayapps.news.data.NewsRepository
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import java.io.IOException

class NewsViewModel(
    private val repository: NewsRepository
) : ViewModel() {

    var uiState by mutableStateOf(NewsUiState())
        private set

    private var fetchJob: Job? = null

    init {
        fetchArticles()
    }

    private fun fetchArticles() {
        fetchJob?.cancel()
        fetchJob = viewModelScope.launch {
            try {
                val newsItems = repository.fetchNewsArticles()
                Log.i("NewsViewModel", "News: $newsItems")
                uiState = uiState.copy(newsItems = newsItems)
            } catch (e: IOException) {
                Log.e("NewsViewModel", "Error: ${e.message}")
                uiState = uiState.copy(errorMessage = e.message)
            }
        }
    }

}