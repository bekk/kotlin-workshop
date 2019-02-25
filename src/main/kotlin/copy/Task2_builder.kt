package copy

import copy.Solution.JavaCar.*
import org.junit.Assert

fun main() {
    Assert.assertEquals(2019, task2().year)
    Assert.assertEquals(2019, task3().year)
    Assert.assertEquals(5, task3().seats)
    Assert.assertEquals(Builder().withYear(2018).build().year, task2().year)
    Assert.assertEquals(Builder().withYear(2018).withSeats(5).build().seats, task3().seats)
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
fun task2() = Car(year = 2019)

/**
 * Change both the 'year' to 2019, and the numbers of 'seats' to 5
 */
fun task3() = Car(year = 2019, seats = 5)