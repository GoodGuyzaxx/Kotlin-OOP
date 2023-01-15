package app

import data.HandPhone
import data.Laptop
import data.SmartPhone

fun printObject(any: Any){
    if (any is Laptop){
        println("Nama Dari Laptop ${any.name}")
    }else if (any is SmartPhone){
        println("Nama Dari Handphone ${any.name}")
    }else{
        println(any)
    }
}
fun printObjectWhen(any: Any){
    when (any){
        is Laptop -> println("Nama Merek Laptop ${any.name}")
        is HandPhone -> println("Nama Merek HP ${any.name}")
        else -> println(any)
    }
}

fun printString(any: Any){
    val value = any as String
    println(value)
}

fun printStringWhiteSafe(any: Any){
    val value: String? = any as? String
    println(value)
}

fun main() {
    printString("zaxx")

    printStringWhiteSafe(12)

    printObject(1)
    printObjectWhen(Laptop("Macbook"))
    printObject(SmartPhone("Nokia","Windows Phone"))
}