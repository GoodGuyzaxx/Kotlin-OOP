package app

import data.Student

fun main() {
    val student = Student("zaxx",18)
    val result=student.let {
        "Nama Saya ${it.name}, umur saya ${it.age}"
    }
    println(result)

    val result2 = student.run {
        "Nama Saya ${this.name}, umur saya ${this.age}"
    }
    println(result2)

    val result3 = student.apply {
        "Nama Saya ${this.name}, umur saya ${this.age}"
    }
    println(result3)
}