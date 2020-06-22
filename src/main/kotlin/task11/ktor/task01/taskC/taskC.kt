package task11.ktor.task01.taskC

import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Location
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import task11.ktor.task01.setupApplication
import task11.ktor.task02.CocktailDTO
import java.util.*

val margarita = CocktailDTO(UUID.randomUUID(), "Margarita", emptyList())
val whiskeySour = CocktailDTO(UUID.randomUUID(), "Whiskey sour", emptyList())
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
