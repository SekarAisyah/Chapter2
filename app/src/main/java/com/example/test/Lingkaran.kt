package com.example.test

//Latihan Code Convention
class Lingkaran(private val jariJari: Double) {  //Pascal Case
    companion object {
        const val PI = 3.14 //Uppercase
    }

    fun hitungLuas(): Double {  //CammelCase
        return PI * jariJari * jariJari
    }
}

fun main() {
    val lingkaran = Lingkaran(7.0)
    val luas = lingkaran.hitungLuas()
    println("Luas lingkaran dengan jari-jari 7 adalah $luas")
}