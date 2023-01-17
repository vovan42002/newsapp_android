package ua.vovan42002.newsapp.models

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)