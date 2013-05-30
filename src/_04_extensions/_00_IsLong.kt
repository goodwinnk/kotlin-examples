package _02_extensions_basic

import java.util.ArrayList

fun main(args: Array<String>) {
    ArrayList<String>()
    println("Kotlin".isLong())
    println("language".isLong())
}














fun String.isLong(): Boolean {
    return this.size > 6
}