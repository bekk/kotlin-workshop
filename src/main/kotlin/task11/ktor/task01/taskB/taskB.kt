package task11.ktor.task01.taskB

import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Location
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import task11.ktor.task01.setupApplication

/**
 * The second task is to make your own API!
 * Remember you can use the REST-client at http://localhost:8089 to test your request
 *
 * Documentation for routing can be found at https://ktor.io/servers/features/locations.html
 *
 * TODO:
 *  Lets create some more cocktails! Use the CocktailDTO class available in this project to create cocktails and return
 *  a list of them at /api/cocktails
 *  Tip: Look at the previous
 */

@Location("/api")
class Root {

    // TODO - Create a "/cocktails" location
}

@KtorExperimentalLocationsAPI
fun main() {
    embeddedServer(Netty, 8089) {
        setupApplication()

        routing {
            // TODO - Handle GET requests for the location you created and return your list of cocktails
        }
    }.start(wait = true)
}
