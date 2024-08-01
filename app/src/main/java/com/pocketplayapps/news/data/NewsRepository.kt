package com.pocketplayapps.news.data

import com.pocketplayapps.news.data.dto.NewsArticle

interface NewsRepository {
    suspend fun fetchNewsArticles(): List<NewsArticle>
}