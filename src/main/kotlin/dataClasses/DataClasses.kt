package dataClasses

import utils.classEqualFieldNamesAndTypes
import utils.tests

import task1
import Wine

fun main(args: Array<String>) {

    tests("",
        { classEqualFieldNamesAndTypes(Solution.task1("The Wine", 2019, "The Winery", 10), task1("The Wine", 2019, "The Winery", 10)) },
        { Solution.task2(JavaWine("test", 1, "test", 1)).name == task2(Wine("test", 1, "test", 1)).name && Solution.task2(JavaWine("test", 1, "test", 1)).score == task2(Wine("test", 1, "test", 1)).score }
    )
    task3()
    task4()
    task5()
}


