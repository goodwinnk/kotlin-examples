package _02_extensions_map

val map = hashMapOf(
        1 to "one",
        2 to "two",
        3 to "three")

fun main(args: Array<String>) {
    for ((key, value) in map) {
        println("${key} -> ${value}")
    }
}