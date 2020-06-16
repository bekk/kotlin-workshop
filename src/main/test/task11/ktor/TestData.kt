package task11.ktor

import task11.ktor.task02.CocktailDTO
import task11.ktor.task02.CreateCocktailDTO
import task11.ktor.task02.CreateIngredientDTO
import task11.ktor.task02.IngredientDTO
import java.util.*

val tequila = IngredientDTO(
    id = UUID.fromString("b2f0bdd0-8e54-45d7-896b-8f4f6f1aad3b"),
    name = "Tequila"
)

val gin = IngredientDTO(
    id = UUID.fromString("5a38250a-158d-4b5c-93b8-345dacdc6876"),
    name = "Gin"
)

val limeJuice = IngredientDTO(
    id = UUID.fromString("e871a63e-5fa1-42fb-8cdd-aa49ddbf0656"),
    name = "Lime juice"
)

val salt = IngredientDTO(
    id = UUID.fromString("9bde8bdd-c473-4f76-9499-0bede908ce05"),
    name = "Salt"
)

val tonicWater = IngredientDTO(
    id = UUID.fromString("b87475bd-b69b-4bbd-9f28-20020f6eb561"),
    name = "Tonic water"
)

val margarita = CocktailDTO(
    id = UUID.fromString("9b59090e-9968-4e43-9675-859f6cc64fda"),
    name = "Margarita",
    ingredients = listOf(tequila, limeJuice, salt)
)

val ginAndTonic = CocktailDTO(
    id = UUID.fromString("e6b3759f-55ec-4a5f-9836-de87e4bf69dc"),
    name = "Gin and tonic",
    ingredients = listOf(gin, tonicWater)
)

val cocktails: List<CocktailDTO> = listOf(margarita)

val createGin = CreateIngredientDTO(name = gin.name)
val createTonicWater = CreateIngredientDTO(name = tonicWater.name)

val createGinAndTonic = CreateCocktailDTO(
    name = ginAndTonic.name,
    ingredient = listOf(createGin, createTonicWater)
)
