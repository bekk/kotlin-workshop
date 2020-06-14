package task11.ktor

import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.*


fun Route.cocktails(
    dao: CocktailDAO
) {
    route("/cocktails") {
        get {
            call.respondText { "GET \"/cocktails\"" }
            // TODO: Get and return cocktails
            // call.respond(dao.getCocktails())
        }

        post {
            call.respondText { "POST \"/cocktails\"" }
            // TODO: Create and persist cocktail
            // val cocktail = call.receive<CreateCocktailDTO>()
            // dao.createCocktail(cocktail)
            // call.respond(HttpStatusCode.Created)
        }

        // Routes to handle cocktails parameter
        cocktail(dao)
    }
}

fun Route.cocktail(
    dao: CocktailDAO
) {
    route("/{cocktailId}") {
        get {
            call.respondText { "GET \"/cocktails/${call.parameters["cocktailId"]}\"" }
            // TODO: Get and return cocktail
            // call.respond(dao.getCocktail(UUID.fromString(call.parameters["cocktailId"])) ?: HttpStatusCode.NotFound)
        }

        put {
            call.respondText { "PUT \"/cocktails/${call.parameters["cocktailId"]}\"" }
            // TODO: Update and persist cocktail
            // val modifiedCocktail = call.receive<CocktailDTO>()
            // dao.updateCocktail(modifiedCocktail)
            // call.respond(HttpStatusCode.NoContent)
        }

        // Routes to handle cocktail ingredients
        ingredients(dao)
    }
}

fun Route.ingredients(
    dao: CocktailDAO
) {
    route("/ingredients") {
        get {
            call.respondText { "GET \"/cocktails/${call.parameters["cocktailId"]}/ingredients\"" }
            // TODO: Get and return ingredients
            // call.respond(dao.getIngredients(UUID.fromString(call.parameters["cocktailId"])) ?: Unit)
        }

        post {
            call.respondText { "POST \"/cocktails/${call.parameters["cocktailId"]}/ingredients\"" }
            // TODO: Create and persist ingredient
            // val ingredient = call.receive<CreateIngredientDTO>()
            // dao.createIngredient(ingredient)
            // call.respond(HttpStatusCode.Created)
        }

        // Routes to handle ingredients parameter
        ingredient(dao)
    }
}

fun Route.ingredient(
    dao: CocktailDAO
) {
    route("/{ingredientId}") {
        get {
            call.respondText { "GET \"/cocktails/${call.parameters["cocktailId"]}/ingredients/${call.parameters["ingredientId"]}\"" }
            // TODO: Get and return ingredient
            // call.respond(dao.getIngredient(UUID.fromString(call.parameters["ingredientId"])) ?: HttpStatusCode.NotFound)
        }

        put {
            call.respondText { "PUT \"/cocktails/${call.parameters["cocktailId"]}/ingredients/${call.parameters["ingredientId"]}\"" }
            // TODO: Update and persist ingredient
            // val modifiedIngredient = call.receive<IngredientDTO>()
            // dao.updateIngredient(modifiedIngredient)
            // call.respond(HttpStatusCode.NoContent)
        }
    }
}
