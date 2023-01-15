package data

abstract class Animals {
    abstract var name: String
    abstract fun Sound(): Unit
}

class Cat : Animals(){
    override var name: String = "Cat"
    override fun Sound() {
        println("Meowwwww")
    }
}