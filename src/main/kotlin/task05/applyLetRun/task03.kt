package task05.applyLetRun

import utils.tests

fun main() {
    tests("run",
        { 6000 == task3() },
        { Solution.run() == task3() }
    )
}

data class Vector3(val x: Int = 10, val y: Int = 20, var z: Int = 30)

/**
 * Another extension function is `run`. It is very similar to `let`, but you can think of
 * it as a combination of  both `let` and `apply`.
 * It gives access to the object properties directly and we can also return a new type.
 *
 * @see run
 *
 * Use the Kotlin `run` function to multiply the Vector3 x, y and z
 */
fun task3(): Int = TODO()
