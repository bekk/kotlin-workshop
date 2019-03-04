package task06.arguments

import utils.tests

fun main() {
    tests("Copy",
        { UserCopy("Vegard", 30).copy(age = 31) == task4() }
    )
}

data class UserCopy(
    val name: String,
    val age: Int
) {

    fun customCopy(
        // default arguments here
    ): UserCopy = TODO("Implement me")
}

/**
 * Kotlin data classes comes with a handy function, copy, which allows us to edit values of immutable objects
 * by copying them to a new object by overwriting default arguments.
 *
 * Lets write our own copy function!
 */
fun task4() = UserCopy("Vegard", 30).customCopy(
    // overwrite age to age = 31
)
