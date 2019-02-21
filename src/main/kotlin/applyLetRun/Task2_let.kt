package applyLetRun

import org.junit.Assert

fun main() {
    Assert.assertEquals(200, task2())
    Assert.assertEquals(Solution.let(), task2())
}

data class Vector(val x: Int = 10, val y: Int = 20)

/**
 * Use the kotlin `let` function to multiply the Vector x and y
 */
fun task2(): Int = Vector(10, 20).let { it ->
    it.x * it.y
}


