package inlineClasses

import utils.tests

fun main() {

    tests(
        { Minutes(60).value == 60}
    )
}

/**
 * Task 1 - Create an inline class
 *
 * Description of inline classes...
 *
 * Create a simple inline class called Minutes that takes an Int parameter.
 * To run the test, uncomment the first test in InlineClasses.kt and run the main method.
 */

inline class Minutes(val value: Int)