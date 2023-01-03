package data

class PersonErik {
    var firstName: String = " "
    var middleName: String = ""
    var lastName: String = ""

    fun getFullName(): String{
        return ("$firstName $middleName $lastName")
    }

}