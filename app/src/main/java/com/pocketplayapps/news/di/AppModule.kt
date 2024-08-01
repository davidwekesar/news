package com.pocketplayapps.news.di

import com.pocketplayapps.news.data.NewsRepository
import com.pocketplayapps.news.data.NewsRepositoryImpl
import com.pocketplayapps.news.data.remote.NewsRemoteDataSource
import com.pocketplayapps.news.data.remote.NewsStackApi
import com.pocketplayapps.news.ui.news.NewsViewModel
import kotlinx.coroutines.Dispatchers
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val appModule = module {
    single {
        Retrofit.Builder()
            .baseUrl("http://api.mediastack.com/v1/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(NewsStackApi::class.java)
    }
    single {
        Dispatchers.IO
    }
    single {
        NewsRemoteDataSource(get(), get())
    }
    single<NewsRepository> { NewsRepositoryImpl(get()) }
    viewModel { NewsViewModel(get()) }
}