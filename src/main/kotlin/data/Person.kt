package data

class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String): Unit {
        println("Halo Selamt pagi $name,perkenalkan nama saya $firstName")
    }

    fun thisKeyword(firstName: String, lastName: String){
        println("Halo aku $firstName $lastName nama kamu pasti ini yah ${this.firstName}")
    }

    fun sayHello(realName: String, realAge: Int ){
        println("Halo nama saya $realName umur saya $realAge tahun, senang berkenalan dengn mu $firstName")
    }

    fun runThis(){
        println("Thing fast chukelnuts")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }

}