package functions

import utils.classEqualFieldNamesAndTypes


fun tests() {

    val boxOne = SolutionBox(99);

    val SolutionBox = Solution.createBoxUsingWidthLengthHeight(10, 10,15);
    val Box = createBox()

    utils.tests(
        { Solution.capitalizeName("hei") == capitalizeName("hei") },
        { Solution.capitalizeName("oLAV") == capitalizeName("oLAV") },
        {SolutionBox.height == Box.height && SolutionBox.length == Box.lenght && SolutionBox.width == Box.width },

        { classEqualFieldNamesAndTypes(boxOne, createBox()) }
    )
}

fun main(args: Array<String>) {
    tests()
}


/**
 * Task 1:
 *
 * Functions in Kotlin is declared by using the keyword "fun". An example could be:
 *
 * fun double(x: Int): Int {
 *    return 2 * x
 *  }
 *
 * Implement capitalizeName. CapitalizeName takes a string and returns the capitalized version of the string.
 */


// TODO: Implement capitalizeName
fun capitalizeName(name: String): String = TODO()


/**
 * Task 2:
 *
 * In kotlin function parameters can have default values, which are used when a corresponding argument is omitted.
 * This allows for a reduced number of overloads compared to other languages.
 *
 */

// TODO: implement createBox with three parameters (width,length and height). All parameters should have an default value of 10
fun createBox(): Box = TODO()


/**
 * Task 3:
 *
 * In Kotlin Function parameters can be named when calling functions.
 * This is very convenient when a function has a high number of parameters or default ones.
 *
 */

fun createBoxWrapper(): Box {

    // TODO: create a new box by only setting the height using named arguments
    return createBox()
}


