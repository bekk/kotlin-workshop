package task12.inlineClasses

import utils.tests

fun main() {

    tests("Hours",
        { task2Value() == 1 },
        { task2ToMinutes() == Minutes(60) }
    )
}

/**
 * Task 2 - Create an inline class, continued
 *
 * Now, let's make a bit more complex inline class.
 * This inline class should be named Hours, and just like the Minutes class we made in the previous task, Hours should
 * take an Int parameter (value). The difference between Minutes and Hours is that the Hours class should have a function
 * called toMinutes, which returns a Minutes instance set to the value passed to Hours, multiplied by 60.
 *
 * In task2Value(), create an instance of Hours with value = 1. Return the value.
 * In task2ToMinutes, create an instance of Hours with value = 1. Return Hours.toMinutes()
 */

class Hours(val value: Int)

fun task2Value(): Int {
    TODO()
}

fun task2ToMinutes(): Minutes {
    TODO()
}