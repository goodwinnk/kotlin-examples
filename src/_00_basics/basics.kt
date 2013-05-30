package _00_basics








fun main(args: Array<String>) {
    println("Hello World!")
}
















fun basicSyntax() {


    val city = "CityName"
    println("Hello ${city.length()}!")








    val world1 = "World"
    val world2 = ("World" + "    ").trim()
    println(world1 == world2)
    println(world1.identityEquals(world2))
    println(world1 identityEquals world2)

    val obj: Any = "Самара"
    val length = if (obj is String)
        obj.length()
    else
        0

    val pair: Pair<Int, String> =
            10.to("String")

    when (world1) {
        "World" -> println("Correct")
        "More" -> println("")
        else -> println("Try something else")
    }
}