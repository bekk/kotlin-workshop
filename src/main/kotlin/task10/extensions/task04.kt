package task10.extensions

fun main() {
    utils.tests("Infix functions",
        {20 == "4" task04 5})
}
/** Infix functions
 * Extension functions can also be prefixed with the infix keyword. This means that the extension function can be called
 * without the dot and parentheses! Infix methods has to have one, and only one, parameter, which must not be vararg or
 * have a default value.
 *
 * Define an extension infix method on the String class called task04. It should convert itself to int(maybe the
 * stdlib has an extension function for this?) and return itself times the parameter.
 *
 * Syntax:
 * infix <Extension function with one parameter>
 */

infix fun String.task04(arg: Int): Nothing {
    return TODO()
}