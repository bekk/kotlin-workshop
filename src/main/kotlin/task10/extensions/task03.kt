package task10.extensions

fun main() {
    val t1 = "valid"
    utils.tests("Extension property",
        {25 == t1.task03})
}

/** Extension property
 * In addition to extending classes with extension functions, one can also extend classes with properties.
 * The syntax is like a normal property with a custom getter, but it can not have a setter and has to have a
 * receiver type.
 *
 * Create an extension property called task03, which extends the String class. It should compute the squared length
 * of the String.
 *
 * Syntax:
 * val <Receiver type>.<Property name>: <Return type>
 *     get() {}
 */

val String.task03: Nothing
    get() = TODO()