package com.example.week78_0706012310042_soal2.data.service
import com.example.week78_0706012310042_soal2.ui.model.*
import retrofit2.http.GET
import retrofit2.http.Query
interface soal2service {
@GET("search.php")
suspend fun searchartist(@Query("S") artisname: String): Artist
@GET("searchalbum.php")
suspend fun search(@Query("s")artisname: String): album
@GET("album.php")
suspend fun albumdetail(@Query("m")albumid: String):albumdetail
@GET("track.php")
suspend fun trackalbum(@Query("m")albumid: String):track
}