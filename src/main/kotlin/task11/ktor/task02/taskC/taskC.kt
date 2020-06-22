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

/**
 * For our last database task we'll try something more complex.
 * We'll be searching the database for cocktails matching an ingredient.
 *
 * TODO:
 *  Prepopulate the database with a few more cocktails and make and endpoint to search for cocktails matching the same
 *  ingredient.
 *  Tip: Take a look at DbUtils.kt for existing ingredients.
 */
@Location("/api/cocktails")
data class Cocktails(val ingredient: String = "")

@KtorExperimentalLocationsAPI
fun main() {
    embeddedServer(Netty, 8089) {
        setupApplication()
        createDbTables(dataSource)

        val dao = CocktailDAO(dataSource)

        // TODO - Add some more cocktails with some of the same ingredients

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
