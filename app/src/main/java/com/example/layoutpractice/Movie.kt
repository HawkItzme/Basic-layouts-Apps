package com.example.layoutpractice

val MOVIE_ID_EXTRA = "movieExtra"
val movieList = mutableListOf<Movie>()
class Movie(
    var poster : Int,
    var director: String,
    var title: String,
    var description: String,
    val id: Int? = movieList.size
)