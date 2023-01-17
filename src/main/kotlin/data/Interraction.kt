package data
interface Interraction {
    var name : String
    //Conceret
    fun greetIng(name: String){
        println("halo $name perkenlakan nama saya ${this.name}")
    }
}

interface Go : Interraction {
    fun go(){
        println("GO!")
    }
}

interface MoveA {
    fun move(){
        println("Move A")
    }
}

interface MoveB {
    fun move(){
        println("Move B")
    }
}
class Human(override var name : String) : Go , Interraction ,MoveA,MoveB{
    //^Multi Interfacer^
    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
        println("Konflik Move")
    }



 //Bisa Kita buat di child classnya atau langsung diinterfacenya
 //   override fun greetIng(name: String) {
 //       println("halo $name perkenlakan nama saya ${this.name}")
 //   }
}