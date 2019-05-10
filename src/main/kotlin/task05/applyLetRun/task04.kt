package task05.applyLetRun

import utils.tests

fun main() {
    tests("with",
        { 240000 == task4() },
        { Solution.with() == task4() }
    )
}

data class Vector4(val x: Int = 10, val y: Int = 20, var z: Int = 30, val w: Int = 40)

/**
 * Some times we want to have an easier way of accessing properties on a variable.
 * Another option in Kotlin is `with`, with is a function that takes a variable
 * and creates a new context. `with` and `run` are very similar, but while `run`
 * is an extension function `with` is a normal function.
 *
 * @see with
 *
 * Use the Kotlin `with` function to multiply the Vector4 x, y and z, w
 */
fun task4(): Int = TODO()
