package app

import data.Rectangle
import data.Shape
import data.Triangel

fun main() {
    val shape = Shape()
    println(shape.corner)

    val shape1 = Rectangle()
    println(shape1.corner)

    val shape2 = Triangel()
    println(shape2.corner)
}