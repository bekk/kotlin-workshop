package dataClasses

import Wine

/**
 * Task 4 - destructuring
 * From a data class, Kotlin generates componentN() functions corresponding to all the properties declared
 * in the primary constructor of the data class. For the Wine data class, Kotlin generates four componentN()
 * functions - component1(), component2(), component3() and component4() corresponding to the id and name properties.
 * In task4, create a new instance of the Wine class and println() each of the components of the class.
 */

fun task4() {
    val wine = Wine("test", 1, "test", 1)
    println(wine.component1())
    println(wine.component2())
    println(wine.component3())
    println(wine.component4())
}