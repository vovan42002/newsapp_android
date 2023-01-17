package ua.vovan42002.newsapp.models

import androidx.room.PrimaryKey
import java.io.Serializable

data class Article(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val author: String?,
    val content: String?,
    val description: String?,
    val publishedAt: String?,
    val title: String?,
    val url: String?,
    val urlToImage: String?
) : Serializable