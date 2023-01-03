package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("zaxx")
    manager.sayHello("dewa")

    val vicepresident = VicePresident("dewa")
    vicepresident.sayHello("zaxx")
}