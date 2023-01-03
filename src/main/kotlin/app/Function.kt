package app

import data.Person

fun main() {
    var zax = Person()
    zax.firstName = "Dewantara"
    zax.middleName = "zax"
    zax.lastName = "wwe"

    zax.runThis()
    zax.sayHello("Dewa")

    println(zax.getFullName())

}