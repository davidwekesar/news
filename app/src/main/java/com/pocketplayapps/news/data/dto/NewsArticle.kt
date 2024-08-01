package com.pocketplayapps.news.data.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NewsArticle(
    val author: String? = null,
    val title: String,
    val description: String,
    val url: String,
    val source: String,
    val image: String? = null,
    val category: String,
    val language: String,
    val country: String,
    @Json(name = "published_at")
    val publishedAt: String
)