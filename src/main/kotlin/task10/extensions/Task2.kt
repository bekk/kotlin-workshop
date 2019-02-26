package task10.extensions

/** Nullable receiver
 * While immutability and non-nullability of properties and variables are one of the great talking points of Kotlin,
 * you just cant get away from the null at times. While calling a method on a null object will throw an exception in
 * Java, handling of null can be delegated to the extension function.
 *
 * Task: Expand task04.dataClasses.task1, but account for nullability as well.
 *
 * To denote a nullable object in Kotlin, a question mark(?) is appended to the type.
 */

fun Nothing.task02(): Nothing {
    return TODO()
}