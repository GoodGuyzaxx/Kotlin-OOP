package app

import data.Costumer
import data.ExecutiveCostumer

fun main() {
    val costumer = Costumer("zaxx",)
    println(costumer.name)
    println(costumer.type)

    val Executive = ExecutiveCostumer("Dewantara", 1000000000)
    println(Executive.name)
    println(Executive.balance)
}