package inlineClasses

import utils.tests

fun main() {

    tests("Minutes",
        { Minutes(60).value == 60}
    )
}

/**
 * Task 1 - Create an inline class
 *
 * Create a simple inline class called Minutes that takes an Int parameter (value).
 * To run the test, uncomment the test in main() and then run it.
 */

inline class Minutes(val value: Int)

fun task() {

    // uncomment to check it works

}