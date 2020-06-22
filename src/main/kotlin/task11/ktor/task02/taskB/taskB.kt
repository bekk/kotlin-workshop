package task11.ktor.task02.taskB

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


/**
 * We need more endpoints for our database rest API.
 * In this task we'll set up a few endpoints for storing and retrieving data.
 *
 * TODO:
 *  Get familiarized with CocktailDAO and use the DAO to store and retrieve cocktails.
 *  Add a put endpoint for storing cocktails
 *  Add a get endpoint to retrieve cocktails
 */
@Location("/api/cocktails")
class Cocktails

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
    // TODO - Add an endpoint for creating and adding new cocktails to the DB

}
