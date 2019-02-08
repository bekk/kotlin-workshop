package applyLetRun

import utils.tests


fun main(args: Array<String>) {
    tests(
        { Solution.test("hei") == oppgave1("hei") },
        { Solution.test("hei4") == oppgave2("hei") },
        { Solution.test("hei4") == oppgave3("hei") }
    )
}

/**
 * Oppgavebeskrivelse ...
 */
fun oppgave1(string: String): String = string

fun oppgave2(string: String): String = TODO()

fun oppgave3(string: String): String = (0/0).toString()
