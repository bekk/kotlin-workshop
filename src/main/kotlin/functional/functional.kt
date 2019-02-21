package functional

import utils.tests

data class Person(val name: String, val age: Int, val friends: List<Person>?)

fun main(args: Array<String>) {
}

/**
 * The kotlin language implements a lot of functional functions which can
 * be used in classes which is extended by the class [Collection].
 * This is classes like [List], and [String]. (Her må det addes litt info)
 *
 * task01 - Use .map to make a list of all names and return this
 *
 * task02 - Use .filter to make a list of all names of people which are over the age of 24
 *
 * task03 - Use sumBy to easily get the sum age of all people
 */

fun task01(listOfPeople: List<Person>): List<String> {
    // TODO: Insert code ->
    return emptyList()
}

fun task02(listOfPeople: List<Person>): List<String> {
    // TODO: Insert code ->
    return emptyList()
}

fun task03(listOfPeople: List<Person>): Int {
    // TODO: Insert code ->
    return -1
}