package app

import data.Employee
import data.Manager
import data.VicePresident

fun main() {
    var employee: Employee = Employee("zaxx")
    employee.sayHello("Budi")

    employee = Manager("zaxx")
    employee.sayHello("Budi")

    employee = VicePresident("zaxx")
    employee.sayHello("Budi")
}