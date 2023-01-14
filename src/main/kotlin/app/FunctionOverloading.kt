package app

import data.Person
import data.Parent
import data.Child

fun main() {
    var zaxx = Person()
    zaxx.firstName = "Dewantara"

    zaxx.sayHello("function overloading")
    zaxx.sayHello("jaki",20)

    var orangTua = Parent("zax")
    orangTua.printMessage("jaki","Melati")

    var anak = Child("")
    anak.printMessage("zaxx","z")
}