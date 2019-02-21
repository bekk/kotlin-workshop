package functional

import utils.tests

fun test_task01() { tests({ listOf("Oslo s - Oslo lufthavn", "Lillehammer - Lillestrøm", "Stavanger - Oslo s") == task01(company) }) }

fun test_task02() { tests({ listOf("Stian", "Thomas", "Håvard", "Vegard", "Herman", "Håkon", "Yrjan", "Vetle", "Petter", "Ole") == task02(company) }) }

fun test_task03() { tests({ listOf(passenger(yrjan, 22, 2200), passenger(vetle, 15, 200), passenger(petter, 44, 1600), passenger(ole, 60, 1300)) == task03(company) }) }

fun test_task04() { tests({ train(route(lillehammer_lillestrom, 24), 15, listOf(passenger(vegard, 87, 8604), passenger(herman, 36, 900), passenger(hakon, 33, 1300))) == task04(company)}) }

fun test_task05() { tests({ passenger(vegard, 87, 8604) == task05(company) }) }

fun test_task06() { tests({ 35.25 == task06(company) }) }