package task11.ktor.task02.taskC

import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Location
import io.ktor.routing.Route
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import task11.ktor.task01.setupApplication
import task11.ktor.task02.CocktailDAO
import task11.ktor.task02.dataSource
import task11.ktor.task02.createDbTables

@Location("/api/cocktails")
data class Cocktails(val ingredient: String = "")

@KtorExperimentalLocationsAPI
fun main() {
    embeddedServer(Netty, 8089) {
        setupApplication()
        createDbTables(dataSource)

        val dao = CocktailDAO(dataSource)

        routing {
            cocktails(dao)
        }
    }.start(wait = true)
}

fun Route.cocktails(
    dao: CocktailDAO
) {
    // TODO - Add an endpoint to find all cocktails containing the same ingredient
}
