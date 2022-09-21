package com.example.layoutpractice

import androidx.recyclerview.widget.RecyclerView
import com.example.layoutpractice.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListner: MovieClickListner
): RecyclerView.ViewHolder(cardCellBinding.root) {
     fun bindMovie(movie: Movie){
         cardCellBinding.Poster.setImageResource(movie.poster)
         cardCellBinding.movTitle.text = movie.title
         cardCellBinding.movDir.text = movie.director


         cardCellBinding.cardView.setOnClickListener{
             clickListner.onClick(movie)
         }
     }
}