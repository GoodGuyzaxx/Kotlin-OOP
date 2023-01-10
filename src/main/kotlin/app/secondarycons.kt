package app

import data.Address

fun main() {
    val address1 = Address("Jalan A","Jaypura")
    val address2 = Address("Jalan B","Jayapura" ,"Waena")
    address2.getFullAdd()
    println(address1.street)
    println(address2.getFullAdd())
}