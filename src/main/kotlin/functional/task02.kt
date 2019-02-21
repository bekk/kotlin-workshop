package functional

import utils.tests

fun main(args: Array<String>) {
    tests(
        { listOf("Stian", "Thomas", "Håvard", "Vegard", "Herman", "Håkon", "Yrjan", "Vetle", "Petter", "Ole") == task01(company) }
    )
    println(task02(company))
}

/**
 * Make a function to return the names of all passengers on all trains
 */
fun task02(company: TrainCompany): List<String> {
    return emptyList()
}