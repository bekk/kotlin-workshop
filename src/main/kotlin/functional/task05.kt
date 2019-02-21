package functional

import utils.tests

fun main(args: Array<String>) {
    //tests(
        //{  == task05(company) }
    //)
    println(task05(company))
}

/**
 * Make a function to return the oldest passenger
 */
fun task05(company: TrainCompany) {
    val oldest = company.trains.flatMap { it.passengers }.maxBy { it.age }
}