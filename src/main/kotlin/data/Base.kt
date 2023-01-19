package data
//Implemen Delegation
interface Base {
    fun sayHello (name: String)
    fun sayGoodBye (name: String)
}

//Tanpa menggunkan Delegation dibuat secara manual
class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hallo $name")
    }

    override fun sayGoodBye(name: String) {
        println("GoodBye $name")
    }
}
//Manual Delegation
class BaseDelegeTwo(val base: Base): Base{
    override fun sayHello(name: String) {
        base.sayHello("Hallo")
    }

    override fun sayGoodBye(name: String) {
        base.sayGoodBye("GoodBye")
    }
}

//Dengan menggunkan Delegation
class BaseDelege(val base: Base) : Base by base
