package app

import data.User

fun main() {
    val user1 = User("zaxx","Dewa")
    val user2 = User("zaxx", "Rahasia123")

    println("Password anda ${user1.password}")
    println("User name anda ${user1.userName}")

    println(user2.userName)
    println(user2.password)
}