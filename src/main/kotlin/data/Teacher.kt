package data

class Teacher() {
    internal fun teach(){
        println("Teach")
    }
}

open class SuperTeacher(val name: String){
    fun superteacher(){
        println("Teacher $name")
    }
}
