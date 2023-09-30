package com.example.proyecto2_chalenge4

import com.google.gson.annotations.SerializedName

class Movie (
    @SerializedName("title")
    var title: String,
    @SerializedName("overview")
    var overview: String,
    @SerializedName("release_date")
    var releaseDate: String,

    @SerializedName("poster_path")
    var posterPath: String
)

/*
"adult": false,
            "backdrop_path": "/1syW9SNna38rSl9fnXwc9fP7POW.jpg",
            "genre_ids": [
                28,
                878,
                12
            ],
            "id": 565770,
            "original_language": "en",
            "original_title": "Blue Beetle",
            "overview": "Recent college grad Jaime Reyes returns home full of aspirations for his future, only to find that home is not quite as he left it. As he searches to find his purpose in the world, fate intervenes when Jaime unexpectedly finds himself in possession of an ancient relic of alien biotechnology: the Scarab.",
            "popularity": 2868.214,
            "poster_path": "/mXLOHHc1Zeuwsl4xYKjKh2280oL.jpg",
            "release_date": "2023-08-16",
            "title": "Blue Beetle",
            "video": false,
            "vote_average": 7.133,
            "vote_count": 997
*/