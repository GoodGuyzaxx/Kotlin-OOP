package app

import data.PersonErik
import data.Time

fun main() {
    val time = Time()
    val erik = PersonErik()
    erik.firstName = "Erik"
    erik.middleName = "Putra"
    erik.lastName = "Raharjo"

    val dewa = PersonErik()
    dewa.firstName = "Dewantara"

    print("Masukan Jam Hadir ${erik.getFullName()}:")
    val timeIn = readLine()!!.toInt()

    if (time.workerIn >= timeIn){
        println("Selamat Pagi ${erik.getFullName()}")
    }else if (timeIn >= time.workerOut){
        println("Waktunya Jam Pulang")
    }else println("anda sudah terlambat ${erik.getFullName()}")
}