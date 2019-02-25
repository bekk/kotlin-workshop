package inlineClasses

import utils.tests

fun main() {

    tests(
        { Hours(1).toMinutes() == 60},
        { Solution.toMinutes(1) == 60},
        { Name("Kotlin").greet() == "Hello, Kotlin" },
        { Name("Kotlin").length == 6 }
    )
}




/**
 * Example of inline class
 *
 * inline class Balance(val money: Double) {
 *   val intValue: Int
 *      get() = money.toInt()
 *
 *   fun prettyPrint() {
 *      println("Your accunt balance is $money money")
 *    }
 * }
 *
 */
