package data

class Student (val name: String, val age : Int)

fun Student?.sayHello(name: String){
    if (this != null){
        println("hello $name, Nama ku ${this.name} dan umur ku ${this.age}")
    }
}

val Student.upperName : String
    get() = this.name.toUpperCase()