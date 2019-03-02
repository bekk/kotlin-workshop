package task02.controlFlow


fun testsWhen() {
    utils.tests("",
        { false == isEven(1) },
        { true == isEven(200) }

    )
}

fun main(args: Array<String>) {
    testsWhen()
}


/**
 * Task 2:
 *
 * When:
 *
 * When is Kotlins replacement of the switch-statement. But When lets us do more than switch in Java.
 * https://kotlinlang.org/docs/reference/control-flow.html
 *
 * In its simplest form a when statement could look like this:
 *
 *  when (x) {
 *      1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }
 *
 * TODO: Instead of checking for 1 and 2 use when to check if x is even or odd .
 */

fun isEven(x: Int): Boolean = TODO()


