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
 * Use the kotlin `run` function to multiply the Vector3 x, y and z
 */
fun task3(): Int = Vector3().run {
    x * y * z
}
