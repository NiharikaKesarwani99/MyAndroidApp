package com.example.HelloActivity

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("id") val id: Long,
    @SerializedName("title") val title: String,
    @SerializedName("overview") val overview: String,
    @SerializedName("poster_path") val posterPath: String,
    @SerializedName("backdrop_path") val backdropPath: String,
    @SerializedName("vote_average") val rating: Float,
    @SerializedName("release_date") val releaseDate: String
)

//class MovieResults {
//    @SerializedName("page")
//    private val page: Int? = null
//
//    @SerializedName("results")
//    private val results: List<ResultsBean>? = null
//
//    @SerializedName("total_pages")
//    private val totalPages: Int? = null
//
//    @SerializedName("total_results")
//    private val totalResults: Int? = null
//
//    class ResultsBean {
//        @SerializedName("adult")
//        var adult: Boolean? = null
//
//        @SerializedName("backdrop_path")
//        var backdropPath: String? = null
//
//        @SerializedName("genre_ids")
//        var genreIds: List<Int>? = null
//
//        @SerializedName("id")
//        var id: Int? = null
//
//        @SerializedName("original_language")
//        var originalLanguage: String? = null
//
//        @SerializedName("original_title")
//        var originalTitle: String? = null
//
//        @SerializedName("overview")
//        var overview: String? = null
//
//        @SerializedName("popularity")
//        var popularity: Double? = null
//
//        @SerializedName("poster_path")
//        var poster_path: String? = null
//
//        @SerializedName("release_date")
//        var releaseDate: String? = null
//
//        @SerializedName("title")
//        var title: String? = null
//
//        @SerializedName("video")
//        var video: Boolean? = null
//
//        @SerializedName("vote_average")
//        var voteAverage: Double? = null
//
//        @SerializedName("vote_count")
//        var voteCount: Int? = null
//    }
//}