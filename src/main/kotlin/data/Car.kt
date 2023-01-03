package data

class Car(pramBrand: String, pramName: String, pramYears: Int) {

    init {
        println("Nama Produk ini $pramBrand")
    }

    constructor(pramBrand: String, pramName: String) : this(pramBrand,pramName, 2022){
        println("Secondary Constructor 1")
    }

    constructor(pramBrand: String) : this (pramBrand, ""){
        println("Secondary Constructor 2")
    }

    var brand: String = pramBrand
    var name: String = pramName
    var years: Int = pramYears
}