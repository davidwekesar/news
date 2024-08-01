package com.pocketplayapps.news.data

import com.pocketplayapps.news.data.dto.NewsArticle
import com.pocketplayapps.news.data.remote.NewsRemoteDataSource

class NewsRepositoryImpl(
    private val newsRemoteDataSource: NewsRemoteDataSource
) : NewsRepository {
    override suspend fun fetchNewsArticles() = newsRemoteDataSource.fetchNewsArticles().newsArticles
}