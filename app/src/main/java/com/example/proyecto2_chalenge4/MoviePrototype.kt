package com.example.proyecto2_chalenge4

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MoviePrototype(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvName = itemView.findViewById<TextView>(R.id.tvName)
    val tvDate = itemView.findViewById<TextView>(R.id.tvDate)
    val tvOverview = itemView.findViewById<TextView>(R.id.tvOverview)
    val ivPoster = itemView.findViewById<ImageView>(R.id.ivPoster)

    fun bind(movie: Movie){
        tvName.text = movie.title
        tvDate.text = movie.releaseDate
        tvOverview.text = movie.overview
        //ivPoster
        Glide.with(itemView).load(movie.posterPath).into(ivPoster)
    }
}