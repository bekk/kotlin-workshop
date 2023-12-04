package task11.ktor.task03


import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import io.ktor.client.*
import io.ktor.client.engine.apache.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.jackson.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.locations.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import task11.ktor.task01.setupApplication

/**
 * Let's have a look at some more use cases for Ktor. Ktor isn't only used for creating REST-interfaces, you can also use it for calling other APIs.
 * In this task we have created an API for you that takes a cocktail name as a query parameter and is supposed to return any matching cocktail names
 * from the CocktailDB API. We have started setting up the CocktailClient, and now your job is to finish it!
 */

class CocktailClient {
    private val client = HttpClient(Apache) {
        install(ContentNegotiation) {
            jackson()
        }
    }
    private val cocktailDbEndpoint = "https://www.thecocktaildb.com/api/json/v1/1/search.php"

    /**
     * TODO:
     * Use the httpClient to send a GET request to the cocktailDbEndpoint. Send the input cocktailName as
     * a query param named "s", for instance like this: https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita
     * The response will be of type Drinks, and you must map this response to a list of Strings.
     */

    fun getCocktail(cocktailName: String): Drinks {
        TODO()
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
data class Drinks(
    val drinks: List<Drink>?,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class Drink(
    val idDrink: String,
    val strDrink: String,
)

@KtorExperimentalLocationsAPI
fun main() {
    val cocktailClient = CocktailClient()

    embeddedServer(Netty, 8089) {
        setupApplication()
        routing {
            get("/cocktails/{cocktail}") {
                val cocktail: String = call.parameters["cocktail"] ?: "You must specify a cocktail"
                call.respond(cocktailClient.getCocktail(cocktail))
            }
        }
    }.start(wait = true)
}
