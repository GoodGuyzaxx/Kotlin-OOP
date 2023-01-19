package app

import data.Fruit

fun main() {
    val fruit = Fruit(100) + Fruit(100)
    val fruit2 = Fruit(300)
    println(fruit)
    println(fruit - fruit2)
}