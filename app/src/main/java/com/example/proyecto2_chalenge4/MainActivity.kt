package com.example.proyecto2_chalenge4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Adapter
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import org.w3c.dom.Text
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    val btNombre = findViewById<Button>(R.id.btNombre)
    val etNombre = findViewById<TextInputEditText>(R.id.etNombre)
    val rvMovie = findViewById<RecyclerView>(R.id.rvPelis)
    val mainURL = "https://api.themoviedb.org/"
    lateinit var movies: List<Movie>
    lateinit var movieAdapter: MovieAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btNombre.setOnClickListener(){
            searchByTitle()
        }
    }

    private fun searchByTitle() {
        val title =  etNombre.text.toString()
        val retrofit = Retrofit.Builder()
            .baseUrl(mainURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service = retrofit.create(MovieService::class.java)
        val request = service.searchMovieByTitle(title)

        request.enqueue(object : Callback<List<Movie>>{
            override fun onResponse(call: Call<List<Movie>>, response: Response<List<Movie>>) {
                movies = response.body()!!
                movieAdapter = MovieAdapter(movies)
                rvMovie.adapter = movieAdapter
                rvMovie.layoutManager = LinearLayoutManager(this@MainActivity)
            }

            override fun onFailure(call: Call<List<Movie>>, t: Throwable) {
                Log.d("MainActivity", t.toString())
            }
        })
    }
}