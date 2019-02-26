package dataClasses

import Wine
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
 * Create two instances of the Wine class.
 * Then create two functions (equals1(), equals2()) that returns the result of each of the types of quals checks.
 *
 * Does IntelliJ suggest that you change one of the checks?
 */

//val wine1 = Wine("test", 1, "test", 1)
//val wine2 = Wine("test", 1, "test", 1)

fun equals1(): Boolean {
    return false
    //return wine1.equals(wine2)
}

fun equals2(): Boolean {
    return false
    //return wine1 == wine2
}