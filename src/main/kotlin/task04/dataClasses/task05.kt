package task04.dataClasses

fun main() {
    println("data classes - destructuring continued:")
    task5()
}
/**
 * Task5 - destructuring continued
 * The component functions enable us to use the so-called destructuring declaration in Kotlin.
 * The destructuring declaration syntax helps you destructure an object into a number of variables like this.
 * Create a new data class with N variables.
 * In task5() instantiate the new data class and use the destructuring declaration to create N variables.
 * Print the out all variables of the class. Run task5() from the main function.
 */

data class Test(val test1: String, val test2: Boolean, val test3: Int)

fun task5() {
    val test = Test("test", true,  1)
    val (name, year, winery) = test

    println(name)
    println(year)
    println(winery)
}