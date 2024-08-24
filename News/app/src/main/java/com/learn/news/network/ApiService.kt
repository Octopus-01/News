package com.learn.news.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

// https://newsapi.org/v2/top-headlines?country=us&apiKey=8af5a516296848acac2ad2e358686950
interface ApiService {
    @GET("top-headlines")
    suspend fun getNewsFromServer(
        @Query("country") country:String = "in",
        @Query("apiKey") apiKey:String = "8af5a516296848acac2ad2e358686950",
    ):
            Response<NewsModel>
}