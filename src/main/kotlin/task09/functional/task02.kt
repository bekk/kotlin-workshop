package task09.functional

import utils.tests

fun main(args: Array<String>) {
    val names = listOf("Stian", "Thomas", "Håvard", "Vegard", "Herman", "Håkon", "Yrjan", "Vetle", "Petter", "Ole")

    tests("get names",
        { names == task02(company) }
    )
}

/**
 * Make a function to return the names of all passengers on all trains
 */
fun task02(company: TrainCompany): List<String> {
    return emptyList()
}