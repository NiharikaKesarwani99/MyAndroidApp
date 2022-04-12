package com.example.HelloActivity

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "21173dc3e74161694934736251e5ee7a",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "21173dc3e74161694934736251e5ee7a",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = "21173dc3e74161694934736251e5ee7a",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/now_playing")
    fun getNowPlayingMovies(
        @Query("api_key") apiKey: String = "21173dc3e74161694934736251e5ee7a",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}

//interface ApiInterface {
//    @GET("/3/movie/{category}")
//    fun listOfMovies(
//        @Path("category") category: String?,
//        @Query("api_key") apiKey: String?,
//        @Query("language") language: String?,
//        @Query("page") page: Int
//    ): Call<MovieResults?>?
//}
