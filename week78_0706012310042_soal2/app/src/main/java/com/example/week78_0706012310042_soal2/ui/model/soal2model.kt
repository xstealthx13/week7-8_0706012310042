package com.example.week78_0706012310042_soal2.ui.model

data class artis(
    var artis: List<Artist>? = null
)
data class Artist(
    var id: Int?,
var name: String?,
var biography: String?
)
data class album(
    var id: Int?,
    var name: String?,
    var year: Int?
)
data class albumdetail(
    var title: String?,
    var id: Int?,
    var year: Int?,
    var genre: String?,
    var description: String?
)
data class track(
    var title: String?,
    var id: Int?
)
data class carialbum(
    var album: List<album>? = null
)
data class albumdetails(
    var details: List<albumdetail>? = null
)
data class tracks(
    var musik: List<track>? = null
)