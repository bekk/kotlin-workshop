package task15.contracts

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

fun main() {
    demonstrate("Kotlin")
    demonstrate(null)
}

/**
 * Task 2 - Contract with smart cast
 * In this task we have provided two functions: isNonNullString() and demonstrate().
 * The isNonNullString() function takes an Any? and returns true if it is a String,
 * or false if it is null or not a String. However, the compiler does not understand that
 * and therefore does not smart-cast the input to a String.
 *
 * Create a contract in isNonNullString() to tell the compiler what you already know.
 */

@OptIn(ExperimentalContracts::class)
fun isNonNullString(input: Any?): Boolean {
    /* contract {
        returns(true) implies (input is String)
    }*/
    return input is String
}

fun demonstrate(input: Any?) {
    if (isNonNullString(input)) {
        // println(input.length) // <- Remove the line comment at the start of this line when a contract is added to isNonNullString()
    }
}