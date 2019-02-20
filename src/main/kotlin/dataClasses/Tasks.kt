import dataClasses.Solution
import dataClasses.JavaWine
import utils.classEqualFieldNamesAndTypes
import utils.tests


fun main(args: Array<String>) {

    tests(
        //{ classEqualFieldNamesAndTypes(Solution.task1("The Wine", 2019, "The Winery", 10), task1("The Wine", 2019, "The Winery", 10)) },
        //{ Solution.task2(JavaWine("test", 1, "test", 1)).name == task2(Wine("test", 1, "test", 1)).name && Solution.task2(JavaWine("test", 1, "test", 1)).score == task2(Wine("test", 1, "test", 1)).score }
    )
    task3()
    task4()
    task5()
}

/**
 * Task 1 - Create a data class
 * In the java class JavaWine, you will find a model for wine reviews.
 * This class contains four variables as well as getters and setters for these.
 * In addition, it has its own methods for equals() and toString().
 * As the first task, declare a Kotlin data class (Wine) that does the same as the Java class JavaWine.
 */
// data class Wine()

/**
 * To test that your newly created data class is "equal" to JavaWine, make the function underneath take in the
 * four fields of the class as parameters and return an instance of the Wine class.
 * Comment out the first test on line 16, and run it.
 */
fun task1() {

}

/**
 * Task 2 - copy
 * The function task2 takes a Wine object as a parameter. In the function, change the object so that
 * the name is changed to have 'wine' at the end of the original name, and the score to +1 of the original score.
 * When your done, uncomment the second test at line 17.
 * Hint: copy()
 */
fun task2() {

}

/**
 * Task 3 - equals
 * In Kotlin, there are two ways to check if one data class equals another: == and .equals
 * Ine task3 create two instances of the Wine class and println() both of the aforementioned methods.
 * Comment out task3() in the main method on top to run it.
 * Does IntelliJ suggest that you change one of the checks?
 */
fun task3() {

}

/**
 * Task 4 - destructuring
 * From a data class, Kotlin generates componentN() functions corresponding to all the properties declared
 * in the primary constructor of the data class. For the Wine data class, Kotlin generates four componentN() functions
 * - component1(), component2(), component3() and component4() corresponding to the id and name properties.
 * In task4, create a new instance of the Wine class and println() each of the components of the class.
 */
fun task4() {

}

/**
 * Task5 - destructuring continued
 * The component functions enable us to use the so-called destructuring declaration in Kotlin.
 * The destructuring declaration syntax helps you destructure an object into a number of variables like this.
 * In task5 create a new instance of the Wine class and use the destructuring declaration to create 4 variables.
 * println() the four variables.
 */

fun task5() {

}
