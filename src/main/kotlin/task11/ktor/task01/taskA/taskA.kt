package task11.ktor.task01.taskA

import io.ktor.application.call
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Location
import io.ktor.locations.get
import io.ktor.response.respondText
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import task11.ktor.task01.setupApplication

@Location("/api")
class Root {

    @Location("/cocktail")
    class Cocktail
}

// TODO - Run the main function and try calling the "/cocktail" endpoint

@KtorExperimentalLocationsAPI
fun main() {
    embeddedServer(Netty, 8089) {
        setupApplication()

        routing {
            get<Root.Cocktail> {
                call.respondText { "Imma here!" }
            }
        }
    }.start(wait = true)
}

