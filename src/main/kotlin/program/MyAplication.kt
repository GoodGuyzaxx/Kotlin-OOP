package program

import annotations.Fancy

@Fancy(author = "zaxx")
class MyAplication(val name: String, val version: Int){
    fun info(): String = "Aplication $name-$version"
}