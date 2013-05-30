package _04_lambdas

val unitF : () -> Unit = {}
val unitF1 : (Int) -> Unit = {}
val someF2 : (Int, String) -> String = {i, s -> s}


















val actualUnitF : Function0<Unit> = unitF
val actualUnitF1 : Function1<Int, Unit> = unitF1
val actualSomeUnitF2 : Function2<Int, String, String> = someF2

open class Parent
class Child : Parent()

var childParent: (Child) -> Parent = { Parent() }
val parentChild : (Parent) -> Child = { Child() }

fun funAssign() {
    childParent = parentChild

    val parent1 = childParent(Child())
    val parent2: Parent = parentChild(Child())
}