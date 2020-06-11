package task13.coroutines


import kotlinx.coroutines.*
import utils.tests

/**
 * Kotlin async
 *
 * async - Kotlin coroutines provides async if you want to do some processing while
 * you wait for the result to finish. For example if you want to update UI while
 * getting some data or if you want to combine some data from an API.
 *
 * - Use 'async' to calculate and combine the sum of facultyOfTen + facultyOfTen
 * - You can use .await() to await result of the mathematical operations when combining them
 *
 */

fun main() {
    task03()
    tests("coroutines - async", {
        task03() == 7257600
    })
}

fun task03(): Int = runBlocking {

    val firstResult = TODO("call faculty of ten async")
    val secondResult = TODO("call faculty of ten async")

    updateUI()

    val sumOfMath = TODO("Sum both results")
    sumOfMath
}

fun updateUI() = GlobalScope.launch { delay(1000L) }

fun facultyOfTen(): Int {
    var result = 1
    for (i in 1..10) { result *= i }
    return result
}