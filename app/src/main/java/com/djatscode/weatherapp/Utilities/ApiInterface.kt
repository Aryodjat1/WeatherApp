package com.djatscode.weatherapp.Utilities

import com.djatscode.weatherapp.Models.WeatherModel
import retrofit2.Call
import retrofit2.http.Query

interface ApiInterface {

    fun getCurrentWeatherData(
        @Query("lat") lat: String,
        @Query("lon") lon: String,
        @Query("APPID") appid: String
    ): Call<WeatherModel>

    fun getCityWeatherData(
        @Query("q") q: String,
        @Query("APPID") appid: String
    ):Call<WeatherModel>

}