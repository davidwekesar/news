package com.pocketplayapps.news.data.remote

import com.pocketplayapps.news.BuildConfig
import com.pocketplayapps.news.data.dto.NewsApiModel
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsStackApi {
    @GET("news?access_key=${BuildConfig.MEDIA_STACK_API_KEY}")
    suspend fun fetchNewsArticles(): NewsApiModel
}