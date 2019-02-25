package inlineClasses

/**
 * Task 1 - Create an inline class
 *
 * Description of inline classes...
 *
 * Create a simple inline class called Hours that takes an Int parameter.
 * The class should have a function called toMinutes that multiplies the value passed to the class by 60.
 * To run the test, uncomment the first test in InlineClasses.kt and run the main method.
 *
 */

inline class Hours(val value: Int) {
    fun toMinutes() = value * 60
}
