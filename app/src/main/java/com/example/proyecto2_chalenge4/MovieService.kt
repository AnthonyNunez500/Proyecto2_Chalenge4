package com.example.proyecto2_chalenge4

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {
    @GET("3/search/movie?api_key=ae6473400bedc2a7b434d4500512ca1f&")
    //https://api.themoviedb.org/3/search/movie?api_key=ae6473400bedc2a7b434d4500512ca1f&query=blue+beetle
    //main url : https://api.themoviedb.org
    //get url: 3/movie/popular
    //apikey: ?api_key=ae6473400bedc2a7b434d4500512ca1f
    //buscar por titulo: &query=blue+beetle
    fun searchMovieByTitle(@Query("&query") query: String): Call<List<Movie>>
}