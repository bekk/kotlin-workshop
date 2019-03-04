package task02.t02_functions


fun main() {

    utils.tests("",
        { Solution.capitalizeName("hei") == capitalizeName("hei") },
        { Solution.capitalizeName("oLAV") == capitalizeName("oLAV") }
    )
}


/**
 * Task 1:
 *
 * Functions in Kotlin is declared by using the keyword "fun". An example could be:
 *
 * fun double(x: Int): Int {
 *    return 2 * x
 *  }
 *
 * Implement capitalizeName. CapitalizeName takes a string and returns the capitalized version of the string.
 */


// TODO: Implement capitalizeName
fun capitalizeName(name: String): String = TODO()



