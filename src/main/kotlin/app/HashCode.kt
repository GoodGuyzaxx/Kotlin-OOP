package app

import data.Company

fun main() {
    val company1 = Company("Pipa")
    val company2 = Company("Pipa")
    val company3 = Company("Batu")

    println(company1.hashCode())
    println(company3.hashCode())
    println(company1.hashCode() == company2.hashCode())
}