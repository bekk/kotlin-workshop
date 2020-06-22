package task11.ktor.task01.taskC

import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Location
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import task11.ktor.task01.setupApplication
import task11.ktor.task02.CocktailDTO
import java.util.*

val margarita = CocktailDTO(UUID.fromString("43ce0fcf-4841-46c6-9615-c62dc316b235"), "Margarita", emptyList())
val whiskeySour = CocktailDTO(UUID.fromString("86244078-ce6f-4648-b6aa-6c8da25a3f61"), "Whiskey sour", emptyList())
val cocktails = listOf(margarita, whiskeySour)

/**
 * It's time to make this more interesting, lets add a way for a user to find the cocktail they're looking for.
 *
 * Lets work with query parameters!
 */
@Location("/api")
class Root {

    // TODO - Create a path-parameterized "/cocktail" location
}

@KtorExperimentalLocationsAPI
fun main() {
    embeddedServer(Netty, 8089) {
        setupApplication()

        routing {
            // TODO - Make use of the path parameter to find and return a specific cocktail
        }
    }.start(wait = true)
}
