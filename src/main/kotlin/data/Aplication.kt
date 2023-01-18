package data
//Implemen Compenion Object
class Aplication(val name: String) {
    companion object {
        fun toUpper(name: String):String{
            return name.toUpperCase()
        }
    }
}