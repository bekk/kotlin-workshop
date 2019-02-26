import dataClasses.*
import utils.classEqualFieldNamesAndTypes
import utils.tests

fun main() {

    tests("data class",
        { classEqualFieldNamesAndTypes(Solution.task1("The Wine", 2019, "The Winery", 10), task1("The Wine", 2019, "The Winery", 10)) }
    )
}

/**
 * Task 1 - Create a data class
 * In the java class JavaWine, you will find a model for wine reviews.
 * This class contains four variables as well as getters and setters for these.
 * In addition, it has its own methods for equals() and toString().
 * As the first task, declare a Kotlin data class (Wine) that does the same as the Java class JavaWine.
 */
//data class Wine(val name: String, val year: Int, val winery: String, val score: Int)

class Wine

/**
 * To test that your newly created data class is "equal" to JavaWine, make the task1 function take in the
 * four fields of the class as parameters and return an instance of the Wine class.
 * Uncomment the first test in DataClasses.kt to run the test.
 */

fun task1(name: String, year: Int, winery: String, score: Int): Wine {
    //return Wine(name, year, winery, score)
    return Wine()
}