package functional

data class TrainCompany(val trains: List<Train>)

data class Train(val route: Route, val numberOfSeats: Int, val passengers: List<Passenger>)

data class Passenger(val name: String, val age: Int, val moneySpentOnTrips: Int)

data class Route(val name: String, val distanceKm: Int)

// Route names
val oslos_oslolufthavn = "Oslo s - Oslo lufthavn"
val lillehammer_lillestrom = "Lillehammer - Lillestrøm"
val stvg_oslos = "Stavanger - Oslo s"

// Passenger names
val stian = "Stian"
val thomas = "Thomas"
val vegard = "Vegard"
val herman = "Herman"
val yrjan = "Yrjan"
val vetle = "Vetle"
val petter = "Petter"
val ole = "Ole"
val havard = "Håvard"
val hakon = "Håkon"

fun trainCompany(trains: List<Train>) = TrainCompany(trains)
fun train(route: Route, numberOfSeats: Int, passengers: List<Passenger>) = Train(route, numberOfSeats, passengers)
fun passenger(name: String, age: Int, moneySpentOnTrips: Int) = Passenger(name, age, moneySpentOnTrips)
fun route(name: String, distanceKm: Int) = Route(name, distanceKm)

val company = trainCompany(
    listOf(
        train(
            route(oslos_oslolufthavn, 35), 10, listOf(
                passenger(stian, 18, 1000),
                passenger(thomas, 20, 670),
                passenger(havard, 22, 520)
            )
        ), train(
            route(lillehammer_lillestrom, 24), 15, listOf(
                passenger(vegard, 87, 8604),
                passenger(herman, 36, 900),
                passenger(hakon, 33, 1300)
            )
        ), train(
            route(stvg_oslos, 100), 20, listOf(
                passenger(yrjan, 22, 2200),
                passenger(vetle, 15, 200),
                passenger(petter, 44, 1600),
                passenger(ole, 60, 1300)
            )
        )
    )
)
