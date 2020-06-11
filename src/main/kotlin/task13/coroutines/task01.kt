package task13.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import utils.tests
import java.util.concurrent.TimeUnit

fun main() {
    tests("Coroutines - launch",
        { task01() == "Hello coroutine!"})
}

/**
 * Kotlin enables asynchronous operations by using coroutines
 *
 * GlobalScope - this is the scope of the coroutine. This decides the
 * lifetime of a coroutine, in this case the coroutine will live for the
 * entire lifetime of the application.
 * It is usually recommended to use a limited coroutine scope, limited
 * to the lifecycle of the component it is used in (For example Fragment, ViewModel, etc.).
 *
 * - Fix delay inside launch coroutine block to make task01 return "Hello coroutine!"
 *
 */

fun task01(): String {
    var stringToReturn: String = ""
    GlobalScope.launch { // launch starts a new coroutine in the background
        delay(1000)
        stringToReturn += "coroutine!"
    }
    stringToReturn += "Hello "
    Thread.sleep(1000)
    return stringToReturn
}