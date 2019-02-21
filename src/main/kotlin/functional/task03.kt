package functional

import utils.tests

fun main(args: Array<String>) {
    tests(
        { listOf(passenger(yrjan, 22, 2200), passenger(vetle, 15, 200), passenger(petter, 44, 1600), passenger(ole, 60, 1300)) == task03(company) }
    )
}

/**
 * Make a function to return the list of passengers which is on trains going farther than 40 km
 */
fun task03(company: TrainCompany): List<Passenger> {
    return emptyList()
}