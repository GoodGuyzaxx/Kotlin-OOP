package app

import exception.ValidationException

fun validationAndSayhello(name: String){
    if (name.isBlank()){
        throw ValidationException("Name Is Blank")
    }else {
        println("Hello $name")
    }
}

fun main() {
    try {
     validationAndSayhello("Dewa")
     validationAndSayhello("")
        validationAndSayhello("Program")
    }catch (error : ValidationException){
        println("Terjadi Error ${error.message}")
    }catch (error : Throwable){
        println("Terjadi Error ${error.message}")
    }finally {
        println("Program Selsai")
    }
}