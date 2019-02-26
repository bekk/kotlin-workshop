package task11.inlineClasses

/**
 * Task 3 - Create an inline class, continued again
 *
 * Create an inline class called Name that takes a String property.
 * Let the inline class have a property length, which gives the length of the string
 * that was passed to the class. Then make the class have a function called greet()
 * that returns a String like this: "Hello, $name"
 *
 * Remember that an inline class can't have 'blocking fields'. If you encounter this
 * problem, see the example inline class in InlineClass.kt
 *
 */

inline class Name(val s: String) {
    val length: Int
        get() = s.length

    fun greet(): String {
        return "Hello, $s"
    }
}