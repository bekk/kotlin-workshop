package task11.ktor

import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.gson.gson
import io.ktor.locations.Locations
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.route
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import java.text.DateFormat


fun main() {
    prepopulateDatabase(dataSource)
    println(CocktailDAO(dataSource).getCocktails())

    val dao = CocktailDAO(dataSource)

    embeddedServer(Netty, 8089) {
        install(Locations)
        install(ContentNegotiation) {
            gson {
                setDateFormat(DateFormat.LONG)
                setPrettyPrinting()
            }
        }

        routing {
            route("/test") {
                get("/get") {
                    call.respond("Imma here")
                }
            }

            cocktails()
//            cocktailsWithLocations(dao)
        }
    }.start(wait = true)
}
