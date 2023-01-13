package data

class Onlyfans(var namaArtis: String = "", var artisDebut: Int = 0) {
    fun sayOnlyArtis(){
        println("Nama artis $namaArtis tahun debutnya $artisDebut")
    }
    fun sayOnlyArtis(greating: String){
        println("$greating ini function overloading")
    }
}
