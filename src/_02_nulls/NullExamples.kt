package _02_nulls

import java.util.Collections
import java.util.ArrayList
import _01_compact.User
import _02_extensions_basic.isLong

fun test() {
    var user: User =
            User("test", "test", 1)
    var nUser: User? =
            User("test", "test", 2)

    nUser = null
//    user = nUser
}














fun main(args : Array<String>) {
    val user: User? = Lib.getSpeaker(5)
//    println(user.age)


//    println(user!!.age)

//    if (user != null) {
//        println(user.age)
//    }
//
//    if (user == null) return
//    println(user.age)

//    println(user?.age)
}




fun collections() {
    val users = Lib.findSpeakers()
}



fun fail() = throw IllegalArgumentException()