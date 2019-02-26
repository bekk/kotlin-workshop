package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    task02()
}

/**
 * Kotlin runBlocking
 *
 * runBlocking - It is also possible to launch a coroutine which blocks the main thread.
 * This is used when you have to wait for some result or other operations that you
 * want to do before continuing the program.
 */

fun task02() {
    runBlocking {
        delay(1000)
    }
}
