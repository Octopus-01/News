package com.learn.news.screen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.learn.news.network.NewsModel
import com.learn.news.repo.Repo
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class NewsViewModel () : ViewModel() {
    var res = mutableStateOf<NewsModel?>(null)

    init {
        viewModelScope.launch {
            res.value = getnews(Repo())
        }
    }
    suspend fun getnews(repo: Repo): NewsModel?{
        return repo.newProvider().body()
    }

}