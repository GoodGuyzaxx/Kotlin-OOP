package data

class Note(title: String) {
    var title: String = title
        get(){
            println("ini Getter")
            return field
        }
        set(value){
            if (value.isNotBlank()){
                println("ini Setter")
                field=value
            }
        }
}

class BigNoteGet(val title: String){
    val bigTitle: String
        get() = title.uppercase()
}