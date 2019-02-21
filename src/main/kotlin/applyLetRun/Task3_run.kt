package applyLetRun

import org.junit.Assert

fun main() {
    Assert.assertEquals(6000, task3())
    Assert.assertEquals(Solution.run(), task3())
}

data class Vector3(val x: Int = 10, val y: Int = 20, var z: Int = 30)

/**
 * Use the kotlin `run` function to multiply the Vector3 x, y and z
 */
fun task3(): Int = Vector3().run {
    x * y * z
}
