package com.example.week78_0706012310042.ui.model

data class responecuaca (
    var cuaca: List<itemcuaca>,
    var nama: String,
    var main: Main
)
data class itemcuaca(
    var id: Int,
    var main: String,
    var deskripsi: String,
    var ikon: String
)
data class Main(
    var temperatur: Double,
    var kelembaban: Int?,
    var feelslike: Double?
)