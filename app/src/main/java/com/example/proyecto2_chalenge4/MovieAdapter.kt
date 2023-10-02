package com.example.proyecto2_chalenge4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.android.material.textfield.TextInputEditText

class MovieAdapter(val movies: List<Movie>):RecyclerView.Adapter<MoviePrototype>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviePrototype {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.prototype_movie, parent, false)

        return MoviePrototype(view)
    }

    override fun onBindViewHolder(holder: MoviePrototype, position: Int) {
        holder.bind(movies[position])
    }

    override fun getItemCount(): Int {
        return movies.size
    }

}


