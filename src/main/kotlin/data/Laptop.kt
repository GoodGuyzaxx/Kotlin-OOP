package data

class Laptop(val name: String)

open class HandPhone(val name: String)

class SmartPhone(name: String, OS:String) : HandPhone(name)
