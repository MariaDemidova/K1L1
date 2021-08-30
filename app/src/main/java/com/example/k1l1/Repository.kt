package com.example.k1l1

object Repository {

    val filmList: List<Film> = listOf(
        Film(),
        Film("Старая кошатница", "musical", 1950),
        Film("Крокодилл против саранчи"),
        Film("Доброе утро в тюрьме", "documentary"),
        Film( ganre = "documentary"),

    )
}