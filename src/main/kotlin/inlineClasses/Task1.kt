package inlineClasses

/**
 * Task 1 - Create an inline class
 *
 * Description of inline classes...
 *
 * As the first task, create a simple inline class called Hours that takes an Int parameter.
 *
 */



inline class Hours(val value: Int) {
    fun toMinutes() = Minutes(value * 60)
}
