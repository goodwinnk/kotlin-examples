package _04_extensions.test

open class A
class B: A()

fun A.test() = 1
fun B.test() = 2

fun testMore() {
    val bb: B = B()
    val ba: A = B()

    bb.test()
    ba.test()
}


