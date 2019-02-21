package extensions

import org.junit.Assert.assertEquals


/** Extensions
 *  In Kotlin, you can extend existing classes with custom functionality, and one of the more prominent uses is
 *  extension functions.
 *
 *  Extension functions add functionality to existing classes, which are then available just like regular member
 *  methods. This is provided for many existing classes by the Kotlin standard library, where they contribute a
 *  substantial amount of new functionality, which previous would be supplied through libraries and static method calls.
 *
 *  For the curious; this is compiled down to static methods in the Java code, which is also how it's available in
 *  Java source files.
 */

fun main() {
        val t1 = "valid"
        val t2: String? = "empty"
        assertEquals("Example", true, "0123".containsAtleastAZero())
//        assertEquals("Task 1", SimpleStringUtils.validate(t1), t1.task01())
//        assertEquals("Task 2", SimpleStringUtils.isEmptyOrNull(t2), t2.task02())
//        assertEquals("Task 3", 25, t1.task03)
//        assertEquals("Task 4", 20, "4" task04 5)
//        assertEquals("Task 5", 20, "4" * 5)
    }

/** An example extension function
 * Below is an example of an extension function, showcasing the syntax. In general, the signature is the following;
 * fun <Extended class>.functionName(): ReturnValue
 *
 * The extended class is called the receiver of the function. Further, the 'receiver type' is the class before the dot,
 * and the receiver object itself is available through the 'this' keyword inside the extension function.
 *
 * Note also that while the example below is utilizing an expression body, this is not a requirement - extension
 * functions can also have a regular block body.
 */
fun String.containsAtleastAZero(): Boolean = this.contains("0")

