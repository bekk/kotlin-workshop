package task12.inlineClasses

import utils.tests

fun main() {

    tests("Name",
        { task3Value("Kotlin") == "Kotlin" },
        { task3Greet("Kotlin") == "Hello, Kotlin" },
        { task3Length("Kotlin") == 6 }
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
 * Remember that an inline class can't have 'blocking fields'.
 *
 * In task3Value(), create an instance of Name and set value to name. Return the value.
 * In task3Greet(), create an instance of Name and set value to name. Return the Name.greet() function.
 * In task3Length(), create an instance of Name and set value to name. Return Name.length.
 *
 */

class Name

fun task3Value(name: String): String {
    TODO()
}

fun task3Greet(name: String): String {
    TODO()
}

fun task3Length(name: String): Int {
    TODO()
}

