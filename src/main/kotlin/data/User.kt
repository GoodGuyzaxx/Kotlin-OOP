package data

class User (var userName: String, var password: String){

    //Mengubah unique code menjadi string
    override fun toString(): String {
        return "username = $userName"
    }
}