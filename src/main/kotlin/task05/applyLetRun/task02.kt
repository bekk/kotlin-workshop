package task05.applyLetRun

import utils.tests

fun main() {
    tests("let",
        { 200 == task2() },
        { Solution.let() == task2() }
    )
}

data class Vector(val x: Int = 10, val y: Int = 20)

/**
 *
 * Another standard function is `let`, it gives us a reference
 * to the object we are working on. So while `apply` lets us modify
 * an object directly without changing the return type, `let` allows
 * us to work with the object and return a new type.
 *
 * @see let
 *
 * Use the Kotlin `let` function to multiply the Vector x and y
 */
fun task2(): Int = TODO()


