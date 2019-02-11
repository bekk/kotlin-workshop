import dataClasses.Solution
import dataClasses.Wine
import utils.classEqualFieldNamesAndTypes
import utils.tests


fun main(args: Array<String>) {
    val wine1 = Solution.test1("test", 1, "test", 1)
    val wine2 = Wine("test", 1, "test", 1)
    val oppgave2 = oppgave2(KotlinWine("test", 1, "test", 1))

    println(wine1)
    println(wine2)
    println(oppgave2)
    tests(
        { classEqualFieldNamesAndTypes(wine1, oppgave1("test", 1, "test", 1)) },
        { wine2.name == oppgave2.name && wine2.score == oppgave2.score }
    )
}

/**
 * In the java class Wine, you will find a model for wine reviews.
 * That class contains four variables and getters and setters for these.
 * In addition it has its own methods for equals(), toString() and hashCode().
 * In the first task declare a Kotlin data class (KotlinWine) that does the same as the Java class Wine.
 */
data class KotlinWine(val name: String, val year: Int, val winery: String, val score: Int)

fun oppgave1(name: String, year: Int, winery: String, score: Int): KotlinWine {
    return KotlinWine(name, year, winery, score)
}

/**
 * Oppgave 2
 * The function oppgave2 takes a KotlinWine object as a parameter. In the function, change the object so that
 * the name is changed to have 'wine' at the end of the original name, and the score to +1 of the original score.
 * Hint: copy()
 */
fun oppgave2(wine: KotlinWine): KotlinWine {
    return wine.copy( name = wine.name + "wine", score = wine.score + 1)
}

