package app

//Gk usah ditanya kenapa nama classnya onlyfans
import data.Onlyfans
import data.Onlyfansnum2

fun greatTing(name: String= ""): String {
    return if(name== ""){
        "hello bro"
    }else{
        return "hello $name"
    }
}

fun main() {

    val luna = Onlyfansnum2("Luna Mer","",2020)
    luna.nameArtisParam
    luna.yearDebutParam
    luna.getFullStatus()
    println(luna.getFullStatus())

    greatTing("dewa")

    val mia = Onlyfans()
    mia.namaArtis = "mia love"
    mia.artisDebut = 2001
    mia.sayOnlyArtis()
    mia.sayOnlyArtis("hi")
}