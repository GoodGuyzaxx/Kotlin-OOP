package app

import data.Company

fun main() {
    val company1 = Company("Pipa")
    val company2 = Company("Pipa",2002)
    val company3 = Company("Batu")

    println(company1 == company2)
    println(company1 == company3)
}