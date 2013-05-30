package extensions.muli

import java.awt.Point
import java.util.regex.Pattern
import java.util.ArrayList






fun main(args : Array<String>) {
    val (file, line) = parseFileNameAndLine("Foo12.java:12")



















    val (x, y) = Point(1, 2)
    println("($x, $y)")

//    testIndexedIteration()
}



fun Point.component1() = x
fun Point.component2() = y








data class KtPoint(val x: Int, val y: Int)

fun testKtPoint() {
    val (x, y) = KtPoint(1, 2)
}










fun parseFileNameAndLine(str: String): Pair<String, Int> {
    val m = str.toGroupsByRegex("([\\w\\.]+):(\\d+)")
    if (m == null) {
        throw IllegalArgumentException("String format is wrong: '$str', must be <file-name>:<line>")
    }
    return Pair(m[1], m[2].toInt())
}















fun testIndexedIteration() {
    for ((i, c) in "abcd".indexed) {
        println("s[$i] = $c")
    }
}


val String.indexed: StringIteratorWithIndices
        get() = StringIteratorWithIndices(this)

class StringIteratorWithIndices(val str: String) : Iterator<Pair<Int, Char>> {
    var i = 0

    public override fun next(): Pair<Int, Char> {
        val result = Pair(i, str[i])
        i++
        return result
    }

    public override fun hasNext(): Boolean = i < str.length

}
















fun String.toGroupsByRegex(regex: String): List<String>? {
    val m = Pattern.compile(regex).matcher(this)
    if (!m.matches()) return null
    val result = ArrayList<String>()
    for (g in 0..m.groupCount()) {
        result.add(m.group(g)!!)
    }
    return result
}
