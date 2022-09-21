package com.example.layoutpractice

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.layoutpractice.databinding.CardCellBinding

class CardAdapter(
    private  val movies: List<Movie>,
    private val clickListner: MovieClickListner
) : RecyclerView.Adapter<CardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
      val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent, false)
        return CardViewHolder(binding, clickListner)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindMovie(movies[position])
    }

    override fun getItemCount(): Int {
       return movies.size
    }
}