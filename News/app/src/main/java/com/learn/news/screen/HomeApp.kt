package com.learn.news.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MonotonicFrameClock
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage


@Composable
fun HomeApp(modifier: Modifier = Modifier,ViewModel: NewsViewModel){
    val res = ViewModel.res.value?.articles!!
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Gray)
        .padding(20.dp)) {
        items(res){
            Card(modifier = Modifier.padding(bottom = 26.dp)) {
                Column() {
                    AsyncImage(
                        model = it.urlToImage,
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxSize(),
                        contentScale = ContentScale.Crop

                    )
                    if (!it.description.isNullOrEmpty()) {
                        Text(
                            text = it.description,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                }

            }
        }
    }

}