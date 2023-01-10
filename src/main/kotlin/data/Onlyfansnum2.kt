package data

class Onlyfansnum2(paramNameArtis: String,paramArtisStatus: String ,paramYearDebut:Int){
    init {
    println("Artis ini bernama $paramNameArtis")
    }
    constructor(paramNameArtis: String): this (paramNameArtis,"",0) {
    }
    var nameArtisParam = paramNameArtis
    var yearDebutParam = paramYearDebut

    fun getFullStatus(): String{
        return("$nameArtisParam $yearDebutParam")
    }
}


