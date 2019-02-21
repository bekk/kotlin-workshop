package functional

import utils.tests

fun main(args: Array<String>) {
    tests(
        { train(route(lillehammer_lillestrom, 24), 15, listOf(passenger(vegard, 87, 8604), passenger(herman, 36, 900), passenger(hakon, 33, 1300))) == task04(company)}
    )
}

/**
 * Make a function to return the train with the most spending passengers
 */
fun task04(company: TrainCompany): Train {
    return company.trains.maxBy { train ->
        train.passengers.sumBy { it.moneySpentOnTrips }
    }!!
}