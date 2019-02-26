package applyLetRun

import utils.tests

fun main() {
    tests("let",
        { 200 == task2() },
        { Solution.let() == task2() }
    )
}

data class Vector(val x: Int = 10, val y: Int = 20)

/**
 * Use the kotlin `let` function to multiply the Vector x and y
 */
fun task2(): Int = Vector(10, 20).let {
    it.x * it.y
}


