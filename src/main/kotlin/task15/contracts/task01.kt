package task15.contracts

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract
// ktlint-disable no-unused-imports

fun main() {
    val request1 = Request("Hello")
    Service().process(request1)

    try {
        val request2 = Request("")
        Service().process(request2)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}

/**
 * Contracts in Kotlin are a feature that allows us to express certain conditions or effects of a function
 * to the compiler. Primarily, they are used to provide additional information about the behavior of the
 * function which can not be expressed through the function's return type or parameters.
 *
 * For instance, a function might always return true if a certain argument is not null.
 * By declaring this in a contract, the compiler can then make smarter inferences, like automatically
 * casting types based on these conditions.
 * This is particularly useful for improving smart-casting and null-safety in Kotlin.
 *
 * See example -->
 * ```
 * fun isValidNumber(input: Any?): Boolean {
 *     contract {
 *         returns(true) implies (input != null)
 *     }
 *     return input is Int && input >= 0
 * }
 * ```
 * The contract in this function states that if the function returns true, then the input is not null.
 *
 * Task1 - contracts
 * In the code below, the function process() takes a Request object as an argument.
 * The function validates the request and then prints the argument.
 * However, the compiler does not understand that if validate() returns without throwing an exception,
 * then the request is not null. In this task, declare a contract in validate() to tell the compiler
 * what you already know.
 */

data class Request(val arg: String)
class Service {
    fun process(request: Request?) {
        validate(request)
        println(request?.arg) // <- Remove this null check when a contract is added to validate()
    }
}

@OptIn(ExperimentalContracts::class)
private fun validate(request: Request?) {
    if (request == null) {
        throw IllegalArgumentException("Undefined request")
    }
    if (request.arg.isBlank()) {
        throw IllegalArgumentException("No argument is provided")
    }
}