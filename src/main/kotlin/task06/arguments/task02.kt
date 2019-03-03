package task06.arguments

import task06.arguments.Solution.JavaCar.Builder
import utils.tests

fun main() {
    tests("Named parameters",
        { 2019 == task2().year },
        { 2019 == task3().year },
        { 5 == task3().seats },
        { Builder().withYear(2019).build().year == task2().year },
        { Builder().withYear(2019).withSeats(5).build().seats == task3().seats }
    )
}

data class Car(
    val name: String = "Tesla",
    val year: Int = 2018,
    val model: String = "Model X",
    val seats: Int = 4
)


/**
 * Kotlin also support named parameters for constructors and functions.
 *
 * So instead of creating a builder for our objects we can overwrite the default arguments we want by naming them.
 * Change the 'year' to 2019
 */
fun task2(): Car = TODO()

/**
 * Change both the 'year' to 2019, and the numbers of 'seats' to 5
 */
fun task3(): Car = TODO()