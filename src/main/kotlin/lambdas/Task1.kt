package lambdas

import utils.tests

fun main() {
    tests("",
        { "hello" == task1() },
        { 20 == task2() },
        { "olleH!" == task3() }
    )
}

fun stringify(lambda: () -> String) = lambda()
fun numberMagic(lambda: (Int) -> Int) = lambda(10)
fun stringFormat(formatter: (String) -> String): (String) -> String = { str -> formatter(str) }

/**
 * Lambdas are powerful! In Kotlin we can easily pass functions as arguments and even assign them to variables.
 *
 * Lets try to pass a function to 'stringify' that returns "hello"
 */
fun task1() = stringify { "hello" }

/**
 * Lets pass a function to 'numberMagic' that doubles the number received.
 */
fun task2() = numberMagic { it * 2 }

/**
 * Lets create a string formatter that reverses a string and adds an exclamation mark (!)
 * Pass the string 'Hello' to it.
 */
fun task3(): String {
    val myStringFormatter = stringFormat { "${it.reversed()}!" }
    return myStringFormatter("Hello")
}