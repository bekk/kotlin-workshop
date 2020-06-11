package task12.inlineClasses

import utils.tests

fun main() {

    tests("Minutes",
        { task1() == 60}
    )
}

/**
 * Task 1 - Create an inline class
 *
 * Create a simple inline class called Minutes that takes an Int parameter (value).
 * In task1(), create an instance of minutes with value 60 and return the value.
 */

class Minutes(val value: Int)

fun task1(): Int {
    TODO()
}