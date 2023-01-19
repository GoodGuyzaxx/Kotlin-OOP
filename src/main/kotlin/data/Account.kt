package data

import kotlin.properties.Delegates
//implemen Lazc Properties
class Account(description: String = "") {
    val name: String by lazy {
        println("Lazy Call")
        "zaxx"
    }
//Implemen Obsevabel Properties
    var description: String by Delegates.observable(description){
        property, oldValue, newValue -> println("${property.name} is chnaged form $oldValue to $newValue")
    }
}