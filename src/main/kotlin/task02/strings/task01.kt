package task02.strings


fun tests() {

    utils.tests("",
        { Solution.formatFirstNameAndSurnam  ("Ola", "Nordmann") == formatFirstAndSurname("Ola", "Nordmann") }
    )
}

fun main(args: Array<String>) {
    tests()
}


/**
 * Task 1:
 *
 * In Kotlin we can use string templates.
 * https://kotlinlang.org/docs/reference/basic-types.html#string-templates
 *
 */


// TODO: Implement formatFirstAndSurname as "{first name} {surname}"
fun formatFirstAndSurname( firstName: String,  surname: String ): String = TODO()
