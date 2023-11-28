package task04.t02_sealedClasses

import utils.classEqualFieldNamesAndTypes
import utils.tests

fun main() {
    tests(
        "sealed classes",
        {
            classEqualFieldNamesAndTypes(
                Solution.Success("Success"),
                returnSuccess(),
            )
        },
        { returnSuccess() is Result },
        {
            classEqualFieldNamesAndTypes(
                Solution.Error(Exception("Error")),
                returnError(),
            )
        },
        { returnError() is Result },
    )
}

/**
 * Task 1: Create a sealed class
 * Sealed classes are used in Kotlin to represent restricted class hierarchies,
 * where a class can have a limited set of subclasses known at compile-time.
 *
 * Create a sealed class named Result which can have two possible outcomes: Success and Error.
 * The Success class should hold a value of type String indicating the successful result,
 * and the Error class should hold an Exception object representing the error.
 */

sealed class Result

fun returnSuccess(): Any {
    return Result // <- Replace this with a Success object
}

fun returnError(): Any {
    val exception = Exception("Error")
    return Result // <- Replace this with an Error object
}
