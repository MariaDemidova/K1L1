package com.example.k1l1
fun main(){
    val test : String = "Test"
    println()

    Repository.filmList.forEach {
        println(it.name)
    }
}
