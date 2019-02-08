package applyLetRun

import utils.classEqualFieldNamesAndTypes
import utils.tests


fun main() { // Parameters to main method is no longer needed as of Kotlin 1.3
    tests(
        { Solution.test("hei") == oppgave1("hei") },
        { Solution.test("hei4") == oppgave2("hei") },
        { Solution.test("hei4") == oppgave3("hei") }
    )
    println(classEqualFieldNamesAndTypes(Test("hei"), Test2("heia")))
}

data class Test(val a: String)
data class Test2(val a: String)

/**
 * Oppgavebeskrivelse ...
 */
fun oppgave1(string: String): String = string

fun oppgave2(string: String): String = TODO()

fun oppgave3(string: String): String = (0/0).toString()
