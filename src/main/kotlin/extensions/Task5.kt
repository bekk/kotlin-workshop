package extensions

/** Operator
 * Extension functions can also be used to overload operators. For a list of the predefined operators, see the following
 * site: https://kotlinlang.org/docs/reference/operator-overloading.html
 *
 * For now, * is represented by the 'times' function, which takes one parameter. Like in Task 4, it should convert
 * itself to an int and return the result of itself times the parameter.
 */

fun Nothing.task5(): Nothing = TODO()

operator fun String.times(i: Int): Int = this.toInt() * i