package copy

import utils.tests

fun main() {
    tests(
        { Solution.JavaUser().name == task1().name },
        { Solution.JavaUser().age == task1().age },
        { User("Vegard", 30) == task1() }
    )
}

/**
 * Set default values for the user object.
 */
data class User(val name: String, val age: Int)


/**
 * Kotlin allows use to define default arguments.
 * The syntax for default argument is 'val variable: Type = defaultValue'
 *
 * Try to add default arguments to the data class so we don't have to supply the name and age.
 */
fun task1() = User("Vegard", 30)
