package data

//Implementasi ENUM CLASS
enum class Gender(val deskripsi: String) {
    MALE("Male"),
    FEMALE("femlae");
    fun showDeskripsi(){
        println(deskripsi)
    }
}