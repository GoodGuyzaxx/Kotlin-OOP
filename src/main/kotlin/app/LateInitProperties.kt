package app
import data.Fan

fun main() {
    var kipas = Fan()
    kipas.brand = "Cosmos"
    println(kipas.brand)

    kipas.initFans("Samsung")
    println(kipas.brand)
}