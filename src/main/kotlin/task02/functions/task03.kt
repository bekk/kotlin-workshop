package task02.functions


fun tests() {

    val box = createBoxWrapper(15)
    utils.tests("",
        { box.height == 15 && box.lenght == 10 && box.width == 10 }
    )
}

fun main(args: Array<String>) {
    tests()
}


/**
 * Task 3:
 *
 * In Kotlin Function parameters can be named when calling task02.functions.
 * This is very convenient when a function has a high number of parameters or default ones.
 *
 */

fun createBoxWrapper(height: Int): Box {

    // TODO: create a new box by only setting the height using named arguments
    return createBox()
}


