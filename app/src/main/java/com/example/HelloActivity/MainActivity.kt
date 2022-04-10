package com.example.HelloActivity

//import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.HelloActivity.databinding.ActivityMainBinding
import com.google.gson.GsonBuilder
import okhttp3.OkHttp
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Path
import retrofit2.http.Query

class MainActivity : AppCompatActivity() {
    private var message: TextView? = null
//    private lateinit var temp: ActivityMainBinding
    private var counter = 0

    private var BASE_URL = "https://api.themoviedb.org"
    private var PAGE = 1
    private var API_KEY = "21173dc3e74161694934736251e5ee7a"
    private var LANGUAGE = "en-US"
    private var CATEGORY = "popular"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        temp = ActivityMainBinding.inflate(layoutInflater)
//        temp.helloImage.setOnClickListener(){
//             Glide.with(this).load("").into(temp.imageView)
//        }

        setContentView(R.layout.activity_main)
//        message = findViewById(R.id.clickCounter)
//        val droid = findViewById<ImageView>(R.id.helloImage)

        //Define and attach click listener
//        droid.setOnClickListener { tapDroid() }

        var retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        var myInterface: ApiInterface = retrofit.create(ApiInterface::class.java)

        var call: Call<MovieResults?>? = myInterface.listOfMovies(CATEGORY, API_KEY, LANGUAGE, PAGE)
    }

    private fun tapDroid() {
        counter++
        val countAsText: String = when (counter) {
            1 -> "once"
            2 -> "twice"
            else -> String.format("%d times", counter)
        }
        message!!.text = String.format("You touched the droid %s", countAsText)
    }
}