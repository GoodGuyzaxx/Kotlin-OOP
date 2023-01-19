package app

import data.Base
import data.BaseDelege
import data.MyBase
import data.BaseDelegeTwo

fun main() {
    val base = MyBase()
    base.sayHello("Wahyudi")
    base.sayGoodBye("Wahyudi")

    val baseDelege = BaseDelege(base)
    baseDelege.sayGoodBye("zaxx")
    baseDelege.sayHello("zaxx")

    val basedelege2 = BaseDelegeTwo(base)
    basedelege2.sayHello("Ilham")
}
