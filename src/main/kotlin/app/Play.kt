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

fun loopInfi(value: Int): Int{
    var result = 1;
    for (i in value downTo 1){
        result *=i
    }
    return result
}
fun main() {
    val mia = Onlyfans()
    mia.nameArtis = "Mia Makalof"
    mia.yearDebutr = 2007

    println(mia.nameArtis)

    val luna = Onlyfansnum2("Luna Mer","",2020)
    luna.nameArtisParam
    luna.yearDebutParam
    luna.getFullStatus()
    println(luna.getFullStatus())

    greatTing("dewa")

    println(loopInfi(10000))
}