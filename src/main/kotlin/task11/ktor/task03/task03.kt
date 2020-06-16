package task11.ktor.task03


import io.ktor.application.call
import io.ktor.application.install
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Location
import io.ktor.locations.Locations
import io.ktor.locations.get
import io.ktor.response.respond
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

/**
 * Lets look at some more use cases for Ktor. Ktor isn't only used for creating REST-interfaces you can also use it for calling other APIs.
 * In this task we have created an API for you that is supposed to return cocktail names from the CocktailDB API that matches the received cocktail
 * query parameter. We have started setting up the CocktailClient, and now your job is to finish it!
 */

@KtorExperimentalLocationsAPI
fun main() {
    val cocktailClient = CocktailClient()

    @Location("/cocktail/findCocktail")
    data class CocktailRequest(val cocktail: String)

    embeddedServer(Netty, 8089) {
        install(Locations)
        routing {
            get<CocktailRequest> { cocktailRequest ->
                val cocktailNames = cocktailClient.getCocktail(cocktailRequest.cocktail)
                call.respond(cocktailNames?.joinToString(",") ?: "Sorry, I don't know that cocktail :(")
            }
        }
    }.start(wait = true)
}
