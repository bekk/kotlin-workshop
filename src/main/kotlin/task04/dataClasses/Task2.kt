package task04.dataClasses

import Wine

/**
 * Task 2 - task05.arguments
 * The function task2 takes a Wine object as a parameter. In the function, change the object so that
 * the name is changed to have 'wine' at the end of the original name, and the score to +1 of the original score.
 * Then, return the newly created object.
 * When your done, uncomment the second test in DataClasses.tk.
 * Hint: task05.arguments()
 */

fun task2(wine: Wine): Wine {
    return wine.copy( name = wine.name + "wine", score = wine.score + 1)
}