package task12.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    println(task01())
}

/**
 * Kotlin enables asynchronous operations by using task12.coroutines
 *
 * GlobalScope - this is the scope of the coroutine. This decides the
 * lifetime of a coroutine, in this case the coroutine will live for the
 * entire lifetime of the application.
 * It is usually recommended to use a limited coroutine scope, limited
 * to the lifecycle of the component it is used in (For example Fragment, ViewModel, etc.).
 *
 * Task: Write code inside the launched coroutine so that the function return "Hello coroutine!
 *
 */

// Need some input on how to make this a fun task here.

fun task01(): String {
    var stringToReturn: String = ""
    GlobalScope.launch { // launch starts a new coroutine in the background
        delay(800L)
        stringToReturn += "coroutine!"
    }
    stringToReturn += "Hello "
    Thread.sleep(1000L)
    return stringToReturn
}