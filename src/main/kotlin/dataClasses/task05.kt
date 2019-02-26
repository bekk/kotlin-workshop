package dataClasses

import Wine

/**
 * Task5 - destructuring continued
 * The component functions enable us to use the so-called destructuring declaration in Kotlin.
 * The destructuring declaration syntax helps you destructure an object into a number of variables like this.
 * In task5 create a new instance of the Wine class and use the destructuring declaration to create 4 variables.
 * println() the four variables.
 */

fun task5() {
    val wine = Wine("test", 1, "test", 1)
    val (name, year, winery, score) = wine

    println(name)
    println(year)
    println(winery)
    println(score)
}