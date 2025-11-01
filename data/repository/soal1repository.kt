package com.example.week78_0706012310042.data.repository
import com.example.week78_0706012310042.data.service.soal1serverservice
import com.example.week78_0706012310042.ui.model.responecuaca
import retrofit2.Retrofit
import okhttp3.OkHttpClient
import retrofit2.converter.moshi.MoshiConverterFactory
import okhttp3.logging.HttpLoggingInterceptor
class soal1repository (private var apikey: String) {
    private var service:soal1serverservice
    init {
        var logger = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BASIC }
        val client = OkHttpClient.Builder().addInterceptor(logger).build()

        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/")
            .addConverterFactory(MoshiConverterFactory.create())
            .client(client)
            .build()
        service = retrofit.create(soal1serverservice::class.java)
    }
    suspend fun getWeather(city: String): Result<responecuaca> {
        return try {
            val resp = service.getcuacabykota(kota = "",apikey)
            Result.success(resp)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
