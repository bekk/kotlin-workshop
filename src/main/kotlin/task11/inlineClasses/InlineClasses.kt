package task11.inlineClasses

import utils.tests

fun main() {

    tests("",
        // Task 1:
        { Minutes(60).value == 60},
        // Task 2:
        { Hours(1).value == 1},
        { Hours(1).toMinutes() == Minutes(60)},
        // Task 3:
        { Name("Kotlin").greet() == "Hello, Kotlin" },
        { Name("Kotlin").length == 6 },
        // Task 4:
        { Days(4).value == 4},
        { Days(4).toHours() == Hours(4 * 24)},
        { Days(4).toHours().toMinutes() == Minutes(4 * 24 * 60) },
        { registration("New User") == Days(4).toHours().toMinutes()}
    )
}




/**
 * Example of inline class
 * --------------------------------------------
 * inline class Balance(val money: Double) {
 *   val intValue: Int
 *      get() = money.toInt()
 *
 *   fun prettyPrint() {
 *      println("Your accunt balance is $ $money ")
 *    }
 * }
 *
 */
