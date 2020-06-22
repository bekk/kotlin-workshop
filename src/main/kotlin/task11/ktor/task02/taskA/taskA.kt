package task11.ktor.task02.taskA

import io.ktor.application.call
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Location
import io.ktor.locations.get
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import task11.ktor.task01.setupApplication
import task11.ktor.task02.CocktailDAO
import task11.ktor.task02.createDbTables
import task11.ktor.task02.dataSource


/**
 * It's time to work with a real database!
 *
 * In this part of the Ktor workshop we'll be using a in memory database. The database is prepopulated with one
 * cocktail containing a few ingredients.
 *
 * Remember you can always use the REST-client at http://localhost:8089 to test your API
 *
 * TODO:
 *  Set up the database, create a few cocktails and check the response of /api/cocktails
 *  Optional: You can see how the database is set up by taking a look at DbUtils.kt
 */
@Location("/api/cocktails")
class Cocktails

@KtorExperimentalLocationsAPI
fun main() {
    embeddedServer(Netty, 8089) {
        setupApplication()
        createDbTables(dataSource)

        // TODO - Instantiate the DAO for cocktails (CocktailDAO.kt) and connect it to the datasource used for the DB
        val dao = TODO()

        // TODO - Implement CocktailDAO.Operations.createCocktail and add some cocktails to the DB at startup

        routing {
            cocktails(dao)
        }
    }.start(wait = true)
}

fun Route.cocktails(
    dao: CocktailDAO
) {
    get<Cocktails> {
        call.respond(dao.getCocktails())
    }
}
