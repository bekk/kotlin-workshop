package task09.functional

import utils.tests

fun main(args: Array<String>) {
    val routes = listOf("Oslo s - Oslo lufthavn", "Lillehammer - Lillestrøm", "Stavanger - Oslo s")

    tests("get route names",
        { routes == task01(company) }
    )
}

/**
 * Make a function to return the name of all train routes
 */
fun task01(company: TrainCompany): List<String> {
    return emptyList()
}