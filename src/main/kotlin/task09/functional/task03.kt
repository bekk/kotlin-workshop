package task09.functional

import utils.tests

fun main(args: Array<String>) {
    val passengers = listOf(
        passenger(yrjan, 22, 2200),
        passenger(vetle, 15, 200),
        passenger(petter, 44, 1600),
        passenger(ole, 60, 1300)
    )

    tests("far passengers",
        { passengers == task03(company) }
    )
}

/**
 * Make a function to return the list of passengers which is on trains going farther than 40 km
 */
fun task03(company: TrainCompany): List<Passenger> {
    return emptyList()
}