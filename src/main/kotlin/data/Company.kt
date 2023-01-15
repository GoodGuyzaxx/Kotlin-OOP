package data

class Company (val name: String, val tahun: Int){
    constructor(name: String) : this(name, 0)

    //Membuat fungsi dimna equals membandingkan parameter objeknya
    override fun equals(other: Any?): Boolean {
        return when (other){
            is Company -> name == other.name
            else -> false
        }
    }
}