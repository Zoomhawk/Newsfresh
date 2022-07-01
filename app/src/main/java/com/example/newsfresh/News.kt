package com.example.newsfresh

//Data class simply means to be that whatever we are initializing
// into it, we are able retrieve/get them all
data class News(
    val title: String,
    val author: String,
    val url: String,
    val imageUrl: String
)