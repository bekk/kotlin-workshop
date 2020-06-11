package task13.coroutines

import kotlinx.coroutines.runBlocking
import utils.tests

fun main() {
    tests("Coroutines - launch",
        { task02() == "Hello runBlocking coroutine!"})
}

/**
 * Kotlin runBlocking
 *
 * runBlocking - It is also possible to launch a coroutine which blocks the main thread.
 * This is used when you have to wait for some result or other operations that you
 * want to do before continuing the program.
 *
 * - As we can see there is no need to insert delays here
 */

fun task02(): String {
    var stringToReturn = ""
    runBlocking {
        stringToReturn += TODO("Add text: runBlocking coroutine!")
    }
    stringToReturn += "Hello "
    return stringToReturn
}
