package app

import data.SuperTeacher
import data.Teacher

//Public = Jika tidak menyebutkan, maka secara otomatis visibility modifiers nya adalah public, yang artinya bisa diakses dari manapun
//Privat = Artinya hanya bisa diakses di tempat deklarasinya
//Protected = Artinya hanya bisa diakses di tempat deklarasi, dan juga turunannya
//Internal = Artinya hanya bisa diakses di module/project yang sama.

fun main() {
    val techer = Teacher()
    techer.teach()

    val superTeaher = SuperTeacher("Dewa")
    superTeaher.superteacher()
}