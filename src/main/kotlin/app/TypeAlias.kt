package app

typealias App = data.Aplication
typealias aplikasi = data.Aplication
typealias App2 = data2.Aplication

fun main() {
    var aplication = App
    println(aplication.toUpper("zaxx"))

    var aplication2 = aplikasi
    println(aplication2.toUpper("dewa"))

    var aplication3 = App2("Dewa")
    println(aplication3)
}