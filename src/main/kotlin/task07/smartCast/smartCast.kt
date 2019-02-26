package task07.smartCast

fun main(args: Array<String>) {
    task02()
}

/**
 * Kotlin is so nice that you don't have to use explicit cast operators like you do in java.
 * Objects that are type checked are automatically cast to the type it is checked against
 *
 * See example -->
 *
 * fun printLengthIfWordIsString(word: Any) {
 *   if (word is String) {
 *     println(word.length)
 *   }
 * }
 *
 * Kotlin compiler automatically casts word to type String which has the property [String.length].
 *
 *
 * task02 - Use 'when' in accumulate to make a function
 */

fun task01() {

}

fun task02(): Int {
    val listOfStringAndIntNumbers = listOf("two", 1, "eight", 9, "three", "six", 4)
    // TODO: Insert code ->
    return -1
}

fun stringNumberToIntNumber(stringNumber: String): Int {
    return when(stringNumber) {
        "one" -> 1
        "two" -> 2
        "three" -> 3
        "four" -> 4
        "five" -> 5
        "six" -> 6
        "seven" -> 7
        "eight" -> 8
        "nine" -> 9
        else -> -1
    }
}

fun accumulate(anyObject: Any): Int {
    // TODO: Insert code ->
    return -1
}
