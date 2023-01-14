package app

import data.SmartPhone

fun main() {
    val SmartPhone = SmartPhone("Nokia", "Windows OS")

    println(SmartPhone.hashCode())
    println(SmartPhone.toString())
}