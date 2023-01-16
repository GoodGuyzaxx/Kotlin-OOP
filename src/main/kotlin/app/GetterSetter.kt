package app
import data.BigNoteGet
import  data.Note

fun main() {
    val note = Note("My Diary")

    println(note.title)

    note.title = "zax"

    val bigNote = BigNoteGet("My Diary 2")
    println(bigNote.bigTitle)
}