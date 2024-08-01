package com.pocketplayapps.news.data.remote

import com.pocketplayapps.news.data.dto.NewsApiModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class NewsRemoteDataSource(
    private val newsApi: NewsStackApi,
    private val ioDispatcher: CoroutineDispatcher
) {
    suspend fun fetchNewsArticles(): NewsApiModel = withContext(ioDispatcher) {
        newsApi.fetchNewsArticles()
    }
}