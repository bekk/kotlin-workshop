package extensions

/** Nullable receiver
 * While immutability and non-nullability of properties and variables are one of the great talking points of Kotlin,
 * you just cant get away from the null at times. While calling a method on a null object will throw an exception in
 * Java, handling of null can be delegated to the extension function.
 *
 * Task: Expand task1, but account for nullability as well.
 *
 * To denote a null-object in Kotlin, the type is postfixed with a question mark(?).
 */

fun String?.task02(): Boolean = this != null && this.task01()