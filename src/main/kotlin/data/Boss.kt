package data

//Impelemntasi Inner Class

class Boss(val name: String) {
    inner class Employee(val name: String) {
        fun sayHi(){
            println("hallo name ku $name, dan ini nama boss ku ${this@Boss.name}")
        }

    }
}