package coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

/**
 * Kotlin async
 *
 * async - Kotlin coroutines provides async if you want to do some processing while
 * you wait for the result to finish. For example if you want to update UI while
 * getting some data or if you want to combine some data from an API.
 *
 */

fun main() {
    val firstRange = GlobalScope.async {
        val sum = arrayOf(1..1000).map {

        }
    }
}