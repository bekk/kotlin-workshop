package task10.extensions

// Remove the double exclamation marks once task02 is implemented
fun main() {
    val t1: String? = "valid"
    utils.tests("Nullable receiver",
        {SimpleStringUtils.isEmptyOrNull(t1) == t1!!.task02()})
}

/** Nullable receiver
 * While immutability and non-nullability of properties and variables are one of the great talking points of Kotlin,
 * you just cant get away from the null at times. While calling a method on a null object will throw an exception in
 * Java, handling of null can be delegated to the extension function.
 *
 * Task: Expand task01, but account for nullability as well.
 *
 * To denote a nullable object in Kotlin, a question mark(?) is appended to the type.
 */

fun String.task02(): Nothing {
    return TODO()
}