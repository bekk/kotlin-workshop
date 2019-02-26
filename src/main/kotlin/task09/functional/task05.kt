package task09.functional

import utils.tests

fun main(args: Array<String>) {
    tests("old passenger",
        { passenger(vegard, 87, 8604) == task05(company) }
    )
}

/**
 * Make a function to return the oldest passenger
 */
fun task05(company: TrainCompany): Passenger? {
    return null
}