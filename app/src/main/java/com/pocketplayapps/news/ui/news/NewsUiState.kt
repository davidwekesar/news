package com.pocketplayapps.news.ui.news

import com.pocketplayapps.news.data.dto.NewsArticle

data class NewsUiState(
    val newsItems: List<NewsArticle> = listOf(),
    val errorMessage: String? = null
)
