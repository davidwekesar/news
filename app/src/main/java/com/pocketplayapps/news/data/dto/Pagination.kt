package com.pocketplayapps.news.data.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Pagination(
    val limit: Int,
    val offset: Int,
    val count: Int,
    val total: Int
)