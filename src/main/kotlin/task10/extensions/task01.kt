package task10.extensions

fun main() {
    val t1 = "valid"
    utils.tests("Extension function",
        {SimpleStringUtils.validate(t1) == t1.task01()})
}


/** Extension function
 *
 * Create an extension function that checks if a given string is valid.
 * It's up to you to define what "valid" is, but if a string contains "42", then it must be valid.
 *
 * Syntax:
 * fun <Receiver Type>.<Function Name>(<Args>): <Return Value> {}
 */
fun String.task01(): Nothing {
    return TODO()
}