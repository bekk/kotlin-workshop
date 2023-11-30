package task14.generics

fun main() {
    val intList = listOf(1, 2, 3)
    val stringList = listOf("a", "b", "c")
    val shortList = listOf(1)

    /*utils.tests(
        "Generic extension functions",
        { intList.secondOrNull() == intList[1] },
        { stringList.secondOrNull() == stringList[1] },
        { shortList.secondOrNull() == null },
    )*/
}

/**
 * Task 2 - Generic extension functions
 * In this task, you will create a generic extension function for List<T> that performs a returns the second element.
 * The function should be named secondOrNull() and return the second element of the list if it exists, or null if it doesn't.
 * Then, demonstrate your extension function on a list of Ints and a list of Strings by removing the block comments in main().
 *
 * TODO: Create an extension function named secondOrNull() that returns the second element of a list if it exists, or null if it doesn't.
 */