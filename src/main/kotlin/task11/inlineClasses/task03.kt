package task11.inlineClasses

import utils.tests

fun main() {

    tests("Name",
        { Name("Kotlin").value == "Kotlin" },
        { Name("Kotlin").greet() == "Hello, Kotlin" },
        { Name("Kotlin").length == 6 }
    )
}

/**
 * Task 3 - Create an inline class, continued again
 *
 * Create an inline class called Name that takes a String property (value).
 * Let the inline class have a property length, which gives the length of the string
 * that was passed to the class. Then create a function inside the class called greet()
 * that returns a String like this: "Hello, $name"
 *
 * Remember that an inline class can't have 'blocking fields'. If you encounter this
 * problem, see the example inline class in InlineClass.kt
 *
 */

inline class Name(val value: String) {
    val length: Int
        get() = value.length

    fun greet(): String {
        return "Hello, $value"
    }
}