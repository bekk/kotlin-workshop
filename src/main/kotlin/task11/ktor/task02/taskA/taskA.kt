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


@Location("/api/cocktails")
class Cocktails

@KtorExperimentalLocationsAPI
fun main() {
    embeddedServer(Netty, 8089) {
        setupApplication()

        // TODO - Add some cocktails to the DB at startup
        // Hint: Implement the prepopulateDatabase function in DbUtils and run it on app-startup

        // TODO - Instantiate a DAO for cocktails and connect it to the datasource used for the DB
        val dao = TODO()

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