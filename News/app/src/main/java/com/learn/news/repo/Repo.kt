package com.learn.news.repo

import com.learn.news.network.ApiProvider
import com.learn.news.network.NewsModel
import retrofit2.Response

class Repo() {
    suspend fun newProvider(): Response<NewsModel>{
        return ApiProvider.provideApi().getNewsFromServer()
    }
}