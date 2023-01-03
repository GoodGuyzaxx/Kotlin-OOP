package app

import data.Person

fun main() {
    var zaxx = Person()
    zaxx.firstName = "Dewantara"

    zaxx.sayHello("function overloading")
    zaxx.sayHello("jaki",20)
}