package com.pocketplayapps.news.ui.news

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pocketplayapps.news.data.dto.NewsArticle
import com.pocketplayapps.news.ui.theme.NewsTheme
import org.koin.androidx.compose.koinViewModel

@Composable
fun LatestNewsScreen(modifier: Modifier = Modifier, viewModel: NewsViewModel = koinViewModel()) {
    val newsArticles = viewModel.uiState.newsItems
    LatestNewsScreen(modifier = modifier, newsArticles = newsArticles)
}

@Composable
private fun LatestNewsScreen(modifier: Modifier = Modifier, newsArticles: List<NewsArticle>) {
    Box(modifier = modifier.fillMaxSize()) {
        LazyColumn {
            items(newsArticles) { newsArticle ->
                Text(text = newsArticle.title, color = MaterialTheme.colorScheme.onBackground)
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewLatestNewsScreen() {
    NewsTheme {
        val newsArticles = getNewsArticles()
        LatestNewsScreen(newsArticles = newsArticles)
    }
}

private fun getNewsArticles(): List<NewsArticle> {
    return listOf(
        NewsArticle(
            author = "TMZ Staff",
            title = "Rafael Nadal Pulls Out Of U.S. Open Over COVID-19 Concerns",
            description = "Rafael Nadal is officially OUT of the U.S. Open ... the tennis legend said Tuesday it's just too damn unsafe for him to travel to America during the COVID-19 pandemic. \"The situation is very complicated worldwide,\" Nadal wrote in a statement. \"The…",
            url = "https://www.tmz.com/2020/08/04/rafael-nadal-us-open-tennis-covid-19-concerns/",
            source = "TMZ.com",
            image = "https://imagez.tmz.com/image/fa/4by3/2020/08/04/fad55ee236fc4033ba324e941bb8c8b7_md.jpg",
            category = "general",
            language = "en",
            country = "us",
            publishedAt = "2020-08-05T05:47:24+00:00"
        ),
        NewsArticle(
            author = "TMZ Staff",
            title = "Rafael Nadal Pulls Out Of U.S. Open Over COVID-19 Concerns",
            description = "Rafael Nadal is officially OUT of the U.S. Open ... the tennis legend said Tuesday it's just too damn unsafe for him to travel to America during the COVID-19 pandemic. \"The situation is very complicated worldwide,\" Nadal wrote in a statement. \"The…",
            url = "https://www.tmz.com/2020/08/04/rafael-nadal-us-open-tennis-covid-19-concerns/",
            source = "TMZ.com",
            image = "https://imagez.tmz.com/image/fa/4by3/2020/08/04/fad55ee236fc4033ba324e941bb8c8b7_md.jpg",
            category = "general",
            language = "en",
            country = "us",
            publishedAt = "2020-08-05T05:47:24+00:00"
        ),
        NewsArticle(
            author = "TMZ Staff",
            title = "Rafael Nadal Pulls Out Of U.S. Open Over COVID-19 Concerns",
            description = "Rafael Nadal is officially OUT of the U.S. Open ... the tennis legend said Tuesday it's just too damn unsafe for him to travel to America during the COVID-19 pandemic. \"The situation is very complicated worldwide,\" Nadal wrote in a statement. \"The…",
            url = "https://www.tmz.com/2020/08/04/rafael-nadal-us-open-tennis-covid-19-concerns/",
            source = "TMZ.com",
            image = "https://imagez.tmz.com/image/fa/4by3/2020/08/04/fad55ee236fc4033ba324e941bb8c8b7_md.jpg",
            category = "general",
            language = "en",
            country = "us",
            publishedAt = "2020-08-05T05:47:24+00:00"
        )
    )
}