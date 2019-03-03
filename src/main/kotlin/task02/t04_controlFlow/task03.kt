package task02.t04_controlFlow

import utils.tests


fun main(args: Array<String>) {
    tests("printing",
        { printOneToHundred() is Unit },
        { printListOfStringsInUpperCase() is Unit }
    )
}


/**
 * Task 3:
 *
 * For loops:
 *
 * Kotlin does not have the classical java for-loop:
 *
 * for(int i = 0; i < a.length; a++){
 *      // Do something
 * }
 *
 * In Kotlin for-loops takes anything that provides an iterator, like Javas for each loop:
 *
 * Java:
 * for (type var : array){
 *      // Do something
 * }
 *
 * Kotlin:
 * for (item: Int in array) {
 *      // Do something
 * }
 *
 * To iterate over numbers Kotlin offers ranges:
 * val oneToTen = 1..10
 * gives us 1,2,3,4,5,6,7,8,9,10
 *
 */

/**
 * Task 1: Print all numbers from 1 to 100.
 */
fun printOneToHundred() {
    TODO()
}


/**
 * Task 2: For each word print the word in upper case.
 */

val words = listOf("pen", "cup", "dog", "spectacles")


fun printListOfStringsInUpperCase() {
    TODO()
}




