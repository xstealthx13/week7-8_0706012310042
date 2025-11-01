package com.example.week78_0706012310042.data.service
import retrofit2.http.GET
import retrofit2.http.Query
import com.example.week78_0706012310042.ui.model.responecuaca
interface soal1serverservice {
    @GET("data/2.5/weather")
    suspend fun getcuacabykota(
        @Query("q") kota: String,
        @Query("appid") apikey: String,
        @Query("units") unit: String = "metric",
    ):responecuaca
}