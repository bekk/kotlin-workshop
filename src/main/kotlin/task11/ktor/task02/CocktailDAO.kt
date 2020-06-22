package task11.ktor.task02

import java.sql.Connection
import java.util.*
import javax.sql.DataSource

data class CreateCocktailDTO(val name: String, val ingredients: List<CreateIngredientDTO>)
data class CreateIngredientDTO(val name: String)

data class CocktailDTO(val id: UUID, val name: String, val ingredients: List<IngredientDTO>)
data class IngredientDTO(val id: UUID, val name: String)

class CocktailDAO(val dataSource: DataSource) {
    fun getCocktails(): List<CocktailDTO> {
        return dataSource.transaction { Operations.getCocktails(this) }
    }

    fun getIngredients(cocktailId: UUID): List<IngredientDTO> {
        return dataSource.transaction { Operations.getIngredients(this, cocktailId) }
    }

    fun createCocktail(cocktail: CreateCocktailDTO): CocktailDTO {
        return dataSource.transaction { Operations.createCocktail(this, cocktail) }
    }
}

private object Operations {
    fun getCocktails(connection: Connection): List<CocktailDTO> {
        return connection
            .prepareStatement("SELECT * from cocktail")
            .executeQuery()
            .map {
                val id = UUID.fromString(getString("id"))
                CocktailDTO(
                    id = id,
                    name = getString("name"),
                    ingredients = getIngredients(connection, id)
                )
            }
    }

    fun getIngredients(connection: Connection, cocktailId: UUID): List<IngredientDTO> {
        return connection
            .prepareStatement("SELECT * FROM ingredient WHERE cocktail_id = ?")
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

    fun createCocktail(connection: Connection, cocktail: CreateCocktailDTO): CocktailDTO = TODO()
    fun createIngredient(connection: Connection, cocktailId: UUID, ingredient: CreateIngredientDTO): IngredientDTO = TODO()
}
