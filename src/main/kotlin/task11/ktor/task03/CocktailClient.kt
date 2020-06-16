package task11.ktor.task03

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import io.ktor.client.HttpClient
import io.ktor.client.HttpClientConfig
import io.ktor.client.engine.apache.Apache
import io.ktor.client.engine.apache.ApacheEngineConfig
import io.ktor.client.features.json.JacksonSerializer
import io.ktor.client.features.json.JsonFeature

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
     * Use the httpClient to make a GET request to the cocktailDbEndpoint. You should send the input cocktailName as
     * a query param named "s". The response will be of type Drinks, and you must map the this response to a list of Strings.
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
