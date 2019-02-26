package applyLetRun

import utils.tests

fun main() {
    tests("with",
        { 24000 == task4() },
        { Solution.with() == task4() }
    )
}

data class Vector4(val x: Int = 10, val y: Int = 20, var z: Int = 30, val w: Int = 40)

/**
 * Use the kotlin `with` function to multiply the Vector3 x, y and z, w
 */
fun task4(): Int = with(Vector4()) {
    x * y * z * w
}
