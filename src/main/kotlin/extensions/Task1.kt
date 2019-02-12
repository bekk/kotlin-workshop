package extensions

/** Extension function
 * Create an extension function that checks if a given string is valid.
 * It's up to you to define what "valid" is, but if a string contains "42", then it must be valid.
 */
fun String.task01(): Boolean = this.contains("42")