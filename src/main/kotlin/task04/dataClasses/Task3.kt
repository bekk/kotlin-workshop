package task04.dataClasses

import Wine

/**
 * Task 3 - equals
 * In Kotlin, there are two ways to check if one data class equals another: == and .equals
 * Ine task3, create two instances of the Wine class and println() both of the aforementioned methods.
 * Comment out task3() in the main method on top to run it.
 * Does IntelliJ suggest that you change one of the checks?
 */

fun task3() {
    val wine1 = Wine("test", 1, "test", 1)
    val wine2 = Wine("test", 1, "test", 1)
    println(wine1.equals(wine2))
    println(wine1 == wine2)
}