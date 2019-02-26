package task09.functional

import utils.tests

fun main(args: Array<String>) {
    val train = train(
        route = route(lillehammer_lillestrom, 24),
        numberOfSeats = 15,
        passengers = listOf(
            passenger(vegard, 87, 8604),
            passenger(herman, 36, 900),
            passenger(hakon, 33, 1300)
        )
    )

    tests("money train",
        { train == task04(company) }
    )
}

/**
 * Make a function to return the train which the passengers have spent the most money on
 */
fun task04(company: TrainCompany): Train? {
    return null
}