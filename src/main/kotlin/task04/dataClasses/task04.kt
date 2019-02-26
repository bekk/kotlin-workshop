package task04.dataClasses

fun main() {

    task4()
}

/**
 * Task 4 - destructuring
 * From a data class, Kotlin generates componentN() functions corresponding to all the properties declared
 * in the primary constructor of the data class. For the task04.dataClasses.Wine data class, Kotlin generates four componentN()
 * functions - component1(), component2(), component3() and component4() corresponding to the id and name properties.
 * In task4, create a new data class with however many  (task4()) that return the class.
 */

data class Test(val en: String, val to: Int, val tre: Boolean)

fun task4(): Test {
    val test = Test("test", 1, true)

    return test
}