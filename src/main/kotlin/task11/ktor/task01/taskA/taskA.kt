package task11.ktor.task01.taskA

import io.ktor.server.application.call
import io.ktor.server.routing.routing
import io.ktor.server.response.respondText
import io.ktor.server.locations.KtorExperimentalLocationsAPI
import io.ktor.server.locations.Location
import io.ktor.server.locations.get
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import task11.ktor.task01.setupApplication

/**
 * Ktor is a framework for building APIs and API clients. Documentation can be found at https://ktor.io/
 * In this first task we'll just check that everything works and try a GET request against our server. The
 * setupApplication method initializes Ktor and configures the web server.
 *
 * For routing we'll be using @Location, the documentation is found at https://ktor.io/servers/features/locations.html
 *
 * TODO:
 *  Run the main function and try calling the "/api/cocktail" endpoint
 *  You can use the REST client located at http://localhost:8089 or any other client to make your request, the API is
 *  located at http://localhost:8089/api/cocktail
 */

@Location("/api")
class Root {

    @Location("/cocktail")
    class Cocktail
}

@KtorExperimentalLocationsAPI
fun main() {
    embeddedServer(Netty, 8089) {
        setupApplication()

        routing {
            get<Root.Cocktail> {
                call.respondText("Imma here!")
            }
        }
    }.start(wait = true)
}

