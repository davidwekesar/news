package com.pocketplayapps.news.data.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NewsApiModel(
    val pagination: Pagination,
    @Json(name = "data")
    val newsArticles: List<NewsArticle>
)