package task11.ktor

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.gson.gson
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.route
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty


fun main() {
    embeddedServer(Netty, 8089, module = Application::main).start(wait = true)
}

fun Application.main() {
    prepopulateDatabase(dataSource)
    println(CocktailDAO(dataSource).getCocktails())

    val dao = CocktailDAO(dataSource)

    mainWithDependencies(dao)
}

fun Application.mainWithDependencies(dao: CocktailDAO) {
    install(io.ktor.locations.Locations)
    install(io.ktor.features.ContentNegotiation) {
        gson {
            setDateFormat(java.text.DateFormat.LONG)
            setPrettyPrinting()
        }
    }

    routing {
        route("/test") {
            get("/get") {
                call.respond("Imma here")
            }
        }

        cocktails(dao)
        // cocktailsWithLocations(dao)
    }
}