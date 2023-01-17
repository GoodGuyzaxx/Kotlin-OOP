package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student: Student? = Student("Dewa", 19)
    student?.sayHello("Jaki")
    println(student?.upperName)
}