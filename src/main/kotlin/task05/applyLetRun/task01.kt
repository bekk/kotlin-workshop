package task05.applyLetRun

import utils.tests

fun main() {
    tests("apply",
        { "Bob" == task1().name },
        { Solution.apply() == task1() }
    )
}

data class User(var name: String = "Alice", val age: Int = 30)

/**
 * Kotlin comes with a rich standard library full of extension function.
 *
 * `apply` is a function that we can call on any object that allows us to
 * modify an object without changing the return type.
 *
 * So calling it on a `User` object and changing a property would
 * return the changed `User` object, not the result of the modifying operation.
 *
 * @see apply
 *
 * Use the Kotlin `apply` function to change the name of the user to "Bob"
 */
fun task1(): User = TODO()

