package data

open class Shape {
    open val corner: Int = -1
    open fun printName(){
        println("ini fungsi utama dari class parent")
    }
}

class Rectangle : Shape(){
    override val corner: Int = 4
    val parentConrner:Int = super.corner + corner
    override fun printName() {
        println("ini fungsi dari class Rectangle")
        super.printName()
    }
}

class Triangel : Shape(){
    override val corner: Int = 3
}