package task14.generics

fun main() {
    val anyArray = arrayOf(1, "2")
    val anyList = listOf("3", 4)
    /*utils.tests(
        "Generic functions with multiple types",
        { createPair("String", 1) == Pair("String", 1) },
        { createPair(1, "String") == Pair(1, "String") },
        { createPair(anyArray, anyList) == Pair(anyArray, anyList) }
    )*/
}

/**
 * Task 3 - Generic functions with multiple types
 * It is possible to write generic functions that take multiple types.
 * In this task, you will create a generic function that takes two different types and returns a Pair of them.
 * The function should be named createPair() and take two parameters of different types.
 * Then, demonstrate your function by removing the block comment in main() and running it.
 *
 * TODO: Write a generic function (createPair()) that takes two different types and returns a Pair of them
 */
