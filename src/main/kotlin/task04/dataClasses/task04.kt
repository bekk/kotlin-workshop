package task04.dataClasses

fun main() {
    println("data classes - destructuring:")
    task4()
}

/**
 * Task 4 - destructuring
 * From a data class, Kotlin generates componentN() functions corresponding to all the properties declared
 * in the primary constructor of the data class. For the task04.dataClasses.Wine data class, Kotlin generates four componentN()
 * functions - component1(), component2(), component3() and component4() corresponding to the id and name properties.
 * Create a new data class with however many properties you want.
 * In task4(), create an instance of that data class and print out componentnN().
 * Run task4() from main().
 */

data class Component1(val test1: String, val test2: String, val test3: String)

fun task4() {
    val component = Component1("test1", "test2", "test3")

    println(component.component1())
    println(component.component2())
    println(component.component3())
}