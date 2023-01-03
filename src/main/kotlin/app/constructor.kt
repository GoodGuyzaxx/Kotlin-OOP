package app

import data.Car

fun main() {
    val honda = Car("Beat")
    honda.years = 2019

    val yamaha = Car("Jupiter","z")

    println(honda.brand)
    println(honda.years)
    println(yamaha.brand)
    println(yamaha.years)
}