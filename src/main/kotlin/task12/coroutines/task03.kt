package task12.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

/**
 * Kotlin async
 *
 * async - Kotlin task12.coroutines provides async if you want to do some processing while
 * you wait for the result to finish. For example if you want to update UI while
 * getting some data or if you want to combine some data from an API.
 *
 */

fun main() {

    task03()

}

fun task03() = runBlocking {
    val timeBeforeTests = System.currentTimeMillis()
    val firstMathOp = runBlocking {
        var result = 1
        for (i in 1..15) { result *= i }
        result
    }

    val secondMathOp = runBlocking {
        var result: Long = 1
        for (i in 1..15) { result *= i }
        result
    }

    // operationToDoBeforeResult()
    // async is slower than runBlocking??
    val result = firstMathOp + secondMathOp
    val runTime = System.currentTimeMillis() - timeBeforeTests
    println(runTime)
}

fun operationToDoBeforeResult() = runBlocking {
    delay(1000)
}