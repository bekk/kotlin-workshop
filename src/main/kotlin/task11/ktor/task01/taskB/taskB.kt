package task11.ktor.task01.taskB

import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Location
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import task11.ktor.task01.setupApplication

// TODO - Create a list of cocktails to return, using the CocktailDTO class available in this project

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
