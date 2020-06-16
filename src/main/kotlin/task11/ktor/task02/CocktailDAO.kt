package task11.ktor.task02

import java.util.*
import javax.sql.DataSource

data class CreateCocktailDTO(val name: String, val ingredient: List<CreateIngredientDTO>)
data class CreateIngredientDTO(val name: String)

data class CocktailDTO(val id: UUID, val name: String, val ingredients: List<IngredientDTO>)
data class IngredientDTO(val id: UUID, val name: String)

class CocktailDAO(val dataSource: DataSource) {
    fun getCocktails(): List<CocktailDTO> {
        return dataSource
            .transaction {
                prepareStatement("SELECT * from cocktail")
                    .executeQuery()
                    .map {
                        val id = UUID.fromString(getString("id"))
                        CocktailDTO(
                            id = id,
                            name = getString("name"),
                            ingredients = getIngredients(id)
                        )
                    }
            }
    }

    fun getCocktail(id: UUID): CocktailDTO? = TODO()
    fun createCocktail(cocktail: CreateCocktailDTO): CocktailDTO = TODO()
    fun updateCocktail(cocktail: CocktailDTO): CocktailDTO = TODO()
    fun deleteCocktail(id: UUID): Unit = TODO()


    fun getIngredients(cocktailId: UUID): List<IngredientDTO> {
        return dataSource
            .transaction {
                prepareStatement("SELECT * FROM ingredient WHERE cocktail_id = ?")
                .apply {
                    setString(1, cocktailId.toString())
                }
                .executeQuery()
                .map {
                    IngredientDTO(
                        id = UUID.fromString(getString("id")),
                        name = getString("name")
                    )
                }

            }
    }

    fun getIngredient(id: UUID): IngredientDTO? = TODO()
    fun createIngredient(ingredient: CreateIngredientDTO): IngredientDTO = TODO()
    fun updateIngredient(ingredient: IngredientDTO): IngredientDTO = TODO()
    fun deleteIngredient(id: UUID): Unit = TODO()
}
