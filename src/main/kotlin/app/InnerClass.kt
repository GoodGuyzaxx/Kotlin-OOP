package app

import data.Boss

fun main() {
    val boss = Boss("Ilham")
    val employee = boss.Employee("jaki")
    employee.sayHi()

    val boss2 = Boss("Yudi")
    val employee2 = boss2.Employee("Bahar")
    employee2.sayHi()
}