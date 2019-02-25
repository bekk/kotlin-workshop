package applyLetRun

import utils.tests

fun main() {
    tests(
        { "Bob" == task1().name },
        { Solution.apply() == task1() }
    )
}

data class User(var name: String = "Alice", val age: Int = 30)

/**
 * Use the kotlin `apply` function to change the name of the user to "Bob"
 */
fun task1(): User = User("Alice", 30).apply { name = "Bob" }

