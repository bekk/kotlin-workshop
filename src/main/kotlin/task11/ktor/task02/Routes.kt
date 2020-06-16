package task11.ktor.task02

import io.ktor.application.call
import io.ktor.locations.Location
import io.ktor.locations.get
import io.ktor.locations.post
import io.ktor.locations.put
import io.ktor.response.respondText
import io.ktor.routing.Route


@Location("/")
class Index

@Location("/cocktails")
class Cocktails {

    @Location("/{cocktailId}")
    data class Cocktail(val cocktailId: String) {

        @Location("/ingredients")
        class Ingredients(val parent: Cocktail)

        @Location("/ingredients/{ingredientId}")
        class Ingredient(val parent: Cocktail, val ingredientId: String)
    }
}

fun Route.cocktails(
    dao: CocktailDAO
) {
    get<Cocktails> {
        call.respondText { "GET \"/cocktails\"" }
        // TODO: Get and return cocktails
        // call.respond(dao.getCocktails())
    }

    post<Cocktails> {
        call.respondText { "POST \"/cocktails\"" }
        // TODO: Create and persist cocktail
        // val cocktail = call.receive<CreateCocktailDTO>()
        // dao.createCocktail(cocktail)
        // call.respond(HttpStatusCode.Created)
    }

    // Register routes to handle cocktail parameter
    cocktail(dao)
}

fun Route.cocktail(
    dao: CocktailDAO
) {
    get<Cocktails.Cocktail> { cocktail ->
        call.respondText { "GET \"/cocktails/${cocktail.cocktailId}\"" }
        // TODO: Get and return cocktail
        // call.respond(dao.getCocktails().ifEmpty { HttpStatusCode.NotFound })
        // call.respond(dao.getCocktail(UUID.fromString(cocktail.cocktailId)) ?: HttpStatusCode.NotFound)
    }

    put<Cocktails.Cocktail> { cocktail ->
        call.respondText { "PUT \"/cocktails/${cocktail.cocktailId}\"" }
        // TODO: Update and persist cocktail
        // val modifiedCocktail = call.receive<CocktailDTO>()
        // dao.updateCocktail(modifiedCocktail)
        // call.respond(HttpStatusCode.NoContent)
    }

    // Register routes to handle ingredients
    ingredients(dao)
}

fun Route.ingredients(
    dao: CocktailDAO
) {
    get<Cocktails.Cocktail.Ingredients> { ingredients ->
        call.respondText { "GET \"/cocktails/${ingredients.parent.cocktailId}/ingredients\"" }
        // TODO: Get and return ingredients
        // call.respond(dao.getIngredients(UUID.fromString(ingredients.parent.cocktailId)) ?: Unit)
    }

    post<Cocktails.Cocktail.Ingredients> { ingredients ->
        call.respondText { "POST \"/cocktails/${ingredients.parent.cocktailId}/ingredients\"" }
        // TODO: Create and persist ingredient
        // val ingredient = call.receive<CreateIngredientDTO>()
        // dao.createIngredient(ingredient)
        // call.respond(HttpStatusCode.Created)
    }

    // Register routes to handle ingredient parameter
    ingredient(dao)
}

fun Route.ingredient(
    dao: CocktailDAO
) {
    get<Cocktails.Cocktail.Ingredient> { ingredient ->
        call.respondText { "GET \"/cocktails/${ingredient.parent.cocktailId}/ingredients/${ingredient.ingredientId}\"" }
        // TODO: Get and return ingredient
        // call.respond(dao.getIngredient(UUID.fromString(ingredient.ingredientId)) ?: HttpStatusCode.NotFound)
    }

    put<Cocktails.Cocktail.Ingredient> { ingredient ->
        call.respondText { "PUT \"/cocktails/${ingredient.parent.cocktailId}/ingredients/${ingredient.ingredientId}\"" }
        // TODO: Update and persist ingredient
        // val modifiedIngredient = call.receive<IngredientDTO>()
        // dao.updateIngredient(modifiedIngredient)
        // call.respond(HttpStatusCode.NoContent)
    }
}