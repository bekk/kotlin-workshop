package task10.extensions

fun main() {
    utils.tests("Operator function",
        {SimpleStringUtils.multiplyStringAndInt("4", 5) == "4" * 5})
}

/** Operator
 * Extension functions can also be used to overload operators. For a list of the predefined operators, see the following
 * site: https://kotlinlang.org/docs/reference/operator-overloading.html
 *
 * For now, * is represented by the 'times' function, which takes one parameter. Like in Task 4, it should convert
 * itself to an int and return the result of itself times the parameter.
 *
 * Syntax:
 * operator <Extension function with correct name and correct number of parameters>
 */

operator fun String.times(arg: Int): Nothing {
    return TODO()
}