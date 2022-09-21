package com.example.layoutpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layoutpractice.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val movieId = intent.getIntExtra(MOVIE_ID_EXTRA, -1 )
        val movie = movieFromID(movieId)
        if(movie != null){
            binding.Poster.setImageResource(movie.poster)
            binding.movTitle.text = movie.title
            binding.movDir.text = movie.director
            binding.description.text = movie.description

        }
    }
    private fun movieFromID(movieId: Int): Movie?{
        for (movie in movieList){
            if(movie.id == movieId)
                return movie
        }
        return null
    }
}