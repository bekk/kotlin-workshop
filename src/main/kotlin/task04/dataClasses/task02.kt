package task04.dataClasses


import utils.tests

fun main() {

    tests("data class - copy",
        { Solution.task2(JavaWine("test", 1, "test", 1)).name == task2(
            WhiteWine(
                "test",
                1,
                "test",
                1
            )
        ).name && Solution.task2(JavaWine("test", 1, "test", 1)).score == task2(
            WhiteWine(
                "test",
                1,
                "test",
                1
            )
        ).score }
    )
}

/**
 * Task 2 - copy
 * The function task2 takes a WhiteWine object as a parameter. In the function, change the object so that
 * the name is changed to have 'wine' at the end of the original name, and the score to +1 of the original score.
 * Then, return the newly created object.
 * When your done, run main()
 *
 * Hint: copy()
 */

data class WhiteWine(val name: String, val year: Int, val winery: String, val score: Int)

fun task2(wine: WhiteWine): WhiteWine {
    return wine
}