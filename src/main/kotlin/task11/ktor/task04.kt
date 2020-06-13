package task11.ktor


import io.ktor.application.call
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.route
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main() {
    val cocktailClient = CocktailClient()

    embeddedServer(Netty, 8089) {
        routing {
            route("/cocktail") {
                get("/findCocktail") {
                    val requestedCocktail = call.parameters["cocktail"] ?: "margarita"
                    val cocktailNames = cocktailClient.getCocktail(requestedCocktail)
                    call.respond(cocktailNames?.joinToString(",") ?: "Sorry, I don't know that cocktail :(")
                }
            }
        }
    }.start(wait = true)
}
