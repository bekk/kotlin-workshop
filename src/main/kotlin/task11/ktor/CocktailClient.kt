package task11.ktor

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import io.ktor.client.HttpClient
import io.ktor.client.HttpClientConfig
import io.ktor.client.call.receive
import io.ktor.client.engine.apache.Apache
import io.ktor.client.engine.apache.ApacheEngineConfig
import io.ktor.client.features.json.JacksonSerializer
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.request.accept
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.client.statement.HttpResponse
import io.ktor.http.ContentType

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

    suspend fun getCocktail(cocktailName: String): List<String>? {
        val drinks = httpClient.get<HttpResponse>("https://www.thecocktaildb.com/api/json/v1/1/search.php") {
            accept(ContentType.Application.Json)
            parameter("s", cocktailName)
        }.call.response.receive<Drinks>()
        drinks.drinks?.forEach {
            println(it.strDrink)
        }
        return drinks.drinks?.map {
            it.strDrink
        }
    }
}

data class Drinks(
    val drinks: List<Drink>?
)

data class Drink(
    val idDrink: String,
    val strDrink: String,
    val strIngredient1: String,
    val strIngredient2: String?,
    val strIngredient3: String?,
    val strIngredient4: String?,
    val strIngredient5: String?,
    val strIngredient6: String?,
    val strIngredient7: String?,
    val strIngredient8: String?,
    val strIngredient9: String?,
    val strIngredient10: String?,
    val strIngredient11: String?,
    val strIngredient12: String?,
    val strIngredient13: String?,
    val strIngredient14: String?,
    val strIngredient15: String?
)
