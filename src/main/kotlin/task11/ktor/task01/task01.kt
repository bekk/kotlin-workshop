package task11.ktor.task01

import com.fasterxml.jackson.core.util.DefaultIndenter
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.jackson.jackson
import io.ktor.locations.Location
import io.ktor.locations.Locations
import io.ktor.locations.get
import io.ktor.response.respondText
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import task11.ktor.task02.CocktailDTO

// TODO - Task 01b - Create a list of cocktails to return
// val margarita = CocktailDTO(UUID.fromString("9b59090e-9968-4e43-9675-859f6cc64fda"), "Margarita", emptyList())
// val whiskeySour = CocktailDTO(UUID.fromString("8c740f24-aff8-11ea-b3de-0242ac130004"), "Whiskey sour", emptyList())
// val cocktails = listOf(margarita, whiskeySour)

// TODO - Task01-c - Create a fake database and populate it
val cocktailsDb = mutableListOf<CocktailDTO>()

@Location("/api")
class Root {

    @Location("/cocktail")
    class Cocktail

    // TODO - Task 01b - Create a "/cocktails" endpoint
    // @Location("/cocktails")
    // class Cocktails

    // TODO - Task 01c - Create a path-parameterized "/cocktail" endpoint
    // @Location("/cocktail/{cocktailId}")
    // class CocktailWithParam(val cocktailId: String)
}

fun main() {
    embeddedServer(Netty, 8089) {
        setup()

        routing {
            get<Root.Cocktail> {
                call.respondText { "Hello world!" }
            }

            // TODO - Task 01b - Return a list of cocktails
            // get<Root.Cocktails> {
            //    call.respond(cocktails)
            // }

            // TODO - Task 01c - Make use of path parameter to find a specific cocktail
            // get<Root.CocktailWithParam> { cocktail ->
            //     val id = try {
            //         UUID.fromString(cocktail.cocktailId)
            //     } catch (e: Exception) {
            //         call.respond(HttpStatusCode.InternalServerError, "Not a valid UUID!")
            //     }
            //
            //     call.respond(cocktails.find { it.id == id } ?: HttpStatusCode.NotFound)
            // }

            // TODO - Task 01d - Make use of fake database to persist cocktails
            // post<Root.Cocktails> {
            //     val createCocktail = call.receive<CreateCocktailDTO>()
            //     val cocktail = CocktailDTO(
            //         id = UUID.randomUUID(),
            //         name = createCocktail.name,
            //         ingredients = createCocktail.ingredient.map {
            //             IngredientDTO(id = UUID.randomUUID(), name = it.name)
            //         }
            //     )
            //     cocktailsDb.add(cocktail)
            //
            //     call.respond(cocktail)
            // }
        }
    }.start(wait = true)
}

private fun Application.setup() {
    install(Locations)
    install(ContentNegotiation) {
        jackson {
            enable(SerializationFeature.INDENT_OUTPUT)
            setDefaultPrettyPrinter(DefaultPrettyPrinter().apply {
                indentArraysWith(DefaultPrettyPrinter.FixedSpaceIndenter.instance)
                indentObjectsWith(DefaultIndenter("  ", "\n"))
            })
            registerKotlinModule()
        }
    }
}
