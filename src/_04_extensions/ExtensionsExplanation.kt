package _04_extensions

import java.util.ArrayList
import _04_extensions.html.join

class Data {
    var value: Int = 0
}

fun <T> init(obj: T, block: (T) -> Unit) {
    block(obj)
}

fun useInit() {
    init(Data()) { data -> data.value = 5 }
}

fun String.isLong(): Boolean {
    return length > 5
}

fun <T> with(obj: T,
             init: T.() -> Unit) : T {
    obj.init()
    return obj
}

fun useWith() {
    val data = with(Data()) {
        value = 5
    }
}

open class Tag(val name: String) {
    val children = ArrayList<Tag>()
    open fun toString() = "<$name>${children.join()}</$name>"

}

class Html: Tag("html")
class Body: Tag("body")
class Head: Tag("head")
class H1(val value: String): Tag("h1") {
    override fun toString(): String {
        return "<h1>${value}</h1>"
    }
}

fun Tag.doInit<T : Tag>(t : T, f : T.() -> Unit) : T{
    t.f()
    children.add(t)
    return t
}

fun Html.head(init: Head.() -> Unit) =
        doInit(Head(), init)
fun Html.body(init: Body.() -> Unit) =
        doInit(Body(), init)
fun Body.h1(message: String) =
        doInit(H1(message), {})

fun html(init: Html.() -> Unit) =
        with(Html(), init)

fun testHtml(): Html {
    return html {
        this.head {}
        body {
            h1("My header")
        }
    }
}

fun main(args: Array<String>) {
    println(testHtml())
}



