package task04.dataClasses

import utils.tests

fun main() {

    tests("data class - equals",
        { equals1() },
        { equals2() }
    )
}

/**
 * Task 3 - equals
 * In Kotlin, there are two ways to check if one data class equals another: == and .equals
 * Create two instances of the WhiteWine class.
 * Then implement the two functions (equals1(), equals2()) that returns the result of each of the types of equals checks.
 *
 * Does IntelliJ suggest that you change one of the checks?
 */

fun equals1(): Boolean {
    return false
}

fun equals2(): Boolean {
    return false
}