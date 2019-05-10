package task07.smartCast

import utils.tests

fun main(args: Array<String>) {
    tests("when",
        { task01("hello") == "HELLO" },
        { task01(42) == "42" },
        { task01(42L) == "dunno" }
        )
}

/**
 * Kotlin is so nice that you don't have to use explicit cast operators like you do in Java.
 * Objects that are type checked are automatically cast to the type it is checked against
 *
 * See example -->
 *
 * fun printLengthIfWordIsString(word: Any) {
 *   if (word is String) {
 *     println(word.length)
 *   }
 * }
 *
 * Kotlin compiler automatically casts word to type String which has the property [String.length].
 *
 *
 * Use Kotlin `when` to return name of the type.
 *   - For a string it should return the uppercase version of the string
 *   - For an int it should return the int as a string
 *   - For anything else "dunno"
 */


fun task01(anything: Any): String = TODO()

