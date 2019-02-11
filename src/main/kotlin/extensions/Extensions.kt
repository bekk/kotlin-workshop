package extensions

import org.junit.Assert.assertEquals


/** Extensions
 *  In Kotlin, you can extend existing classes with custom functionality, and one of the more prominent uses is
 *  extension functions.
 *
 *  Extension functions add functionality to existing classes, which are then available just like regular member
 *  methods. This is provided for many existing classes by the Kotlin standard library, where they contribute a
 *  substantial amount of new functionality, which previous would be supplied through libraries and static method calls.
 */

class Extensions {
    fun exampleStaticCalls() {
        val a = ""
        val v1 = "valid"
        val v2: String? = "empty"
        assertEquals("Example", true, "0123".containsAtleastAZero())
        //assertEquals("Task 1", SimpleStringUtils.validate(v1), v1.task01())
        //assertEquals("Task 2", SimpleStringUtils.isEmptyOrNull(v2), v2.task02())
        //assertEquals("Task 3", 25, v2.squaredLength)
        //assertEquals("Task 4", 20, "4" times 5)
        //assertEquals("Task 5", 20, "4" times 5)
        println(SimpleStringUtils.removeWhiteSpace(a))
        println(SimpleStringUtils.validate(a))
    }

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

