package app

data class Friend(val name: String)

fun sayHello(friend: Friend?){
//    if(friend != null){
//        println("hello ${friend.name}")
//   }
    //Elvis Operator
//    val name = friend?.name ?: "Friend"
//    println("hello $name")
    val notNullFriend = friend!!
    val name = friend.name
    println("hello $name")
}

fun main() {
    sayHello(Friend("Dewa"))
    sayHello(null)//
}

