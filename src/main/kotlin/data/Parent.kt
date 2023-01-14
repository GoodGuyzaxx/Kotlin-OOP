package data

open class Parent(val name: String) {
    open fun printMessage(nameAyah : String, nameIbu: String ){
        println("Nama ayah $nameAyah dan nama ibu ${this.name}")
    }
}

class Child(name: String) : Parent(name) {
    override fun printMessage(nameAyah: String, nameIbu: String) {
        println("Nama Anak $nameAyah")
    }
}