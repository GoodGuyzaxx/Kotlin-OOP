package app

import data.Gender

fun main() {
    val man = Gender.MALE
    val women = Gender.FEMALE
    val getAllGender: Array<Gender> = Gender.values()

    val manFromString = Gender.valueOf("MALE")
    val womenFromString = Gender.valueOf("FEMALE")

    println(man)
    println(women)
    println(getAllGender)

    man.showDeskripsi()
    women.showDeskripsi()
}