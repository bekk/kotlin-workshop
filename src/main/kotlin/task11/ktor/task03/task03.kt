package task11.ktor.task03


import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.client.HttpClient
import io.ktor.client.HttpClientConfig
import io.ktor.client.engine.apache.Apache
import io.ktor.client.engine.apache.ApacheEngineConfig
import io.ktor.client.features.json.JacksonSerializer
import io.ktor.client.features.json.JsonFeature
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Location
import io.ktor.locations.Locations
import io.ktor.locations.get
import io.ktor.response.respond
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import task11.ktor.task01.setupApplication

/**
 * Let's have a look at some more use cases for Ktor. Ktor isn't only used for creating REST-interfaces, you can also use it for calling other APIs.
 * In this task we have created an API for you that takes a cocktail name as a query parameter and is supposed to return any matching cocktail names
 * from the CocktailDB API. We have started setting up the CocktailClient, and now your job is to finish it!
 */

class CocktailClient {
    private val config: HttpClientConfig<ApacheEngineConfig>.() -> Unit = {
        install(JsonFeature) {
            serializer = JacksonSerializer {
                registerKotlinModule()
                configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            }
        }
    }
    private val httpClient = HttpClient(Apache, config)
    private val cocktailDbEndpoint = "https://www.thecocktaildb.com/api/json/v1/1/search.php"

    /**
     * TODO:
     * Use the httpClient to send a GET request to the cocktailDbEndpoint. Send the input cocktailName as
     * a query param named "s", for instance like this: https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita
     * The response will be of type Drinks, and you must map this response to a list of Strings.
     */

    fun getCocktail(cocktailName: String): List<String>? {
        TODO()
    }
}

data class Drinks(
    val drinks: List<Drink>?
)

data class Drink(
    val idDrink: String,
    val strDrink: String
)


@KtorExperimentalLocationsAPI
fun main() {
    val cocktailClient = CocktailClient()

    @Location("/cocktail/findCocktail")
    data class CocktailRequest(val cocktail: String)

    embeddedServer(Netty, 8089) {
        setupApplication()
        install(Locations)
        routing {
            get<CocktailRequest> { cocktailRequest ->
                val cocktailNames = cocktailClient.getCocktail(cocktailRequest.cocktail)
                call.respond(cocktailNames?.joinToString(",") ?: "Sorry, I don't know that cocktail :(")
            }
        }
    }.start(wait = true)
}
