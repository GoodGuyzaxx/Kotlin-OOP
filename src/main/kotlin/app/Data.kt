package app

import data.Product

fun main() {
    val product = Product("Roma", 7_000,"Snacke")
    val product2 = product.copy(name = "Indomie", category = "Food")
    println(product)
    println(product2)
}