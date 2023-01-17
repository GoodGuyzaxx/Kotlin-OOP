package data
interface Interraction {
    var name : String
    fun greetIng(name: String){
        println("halo $name perkenlakan nama saya ${this.name}")
    }
}

class Human(override var name : String) : Interraction {
 //Bisa Kita buat di child classnya atau langsung diinterfacenya
 //   override fun greetIng(name: String) {
 //       println("halo $name perkenlakan nama saya ${this.name}")
 //   }
}