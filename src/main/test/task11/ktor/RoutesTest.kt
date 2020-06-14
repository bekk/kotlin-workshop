package task11.ktor

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import io.ktor.http.HttpMethod
import io.ktor.server.testing.handleRequest
import io.ktor.server.testing.setBody
import io.ktor.server.testing.withTestApplication
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import kotlin.test.Test
import kotlin.test.assertEquals

class RoutesTest {
    val dao: CocktailDAO = mockk()

    init {
        every { dao.getCocktails() } returns cocktails
        every { dao.getCocktail(margarita.id) } returns margarita
        every { dao.createCocktail(createGinAndTonic) } returns ginAndTonic
    }

    @Test
    fun `GET should return cocktails and 200 OK`() = withTestApplication({
        mainWithDependencies(dao)
    }) {
        val call = handleRequest(HttpMethod.Get, "/cocktails")
        val statusCode = call.response.status()!!
        val responseType = object : TypeToken<List<CocktailDTO>>() {}.type
        val content = Gson().fromJson<List<CocktailDTO>>(call.response.content!!, responseType)

        verify { dao.getCocktails() }
        assert(statusCode.value == 200)
        assertEquals(cocktails, content)
    }

    @Test
    fun `POST should persist cocktail and return 201 Created`() = withTestApplication({
        mainWithDependencies(dao)
    }) {
        val call = handleRequest(HttpMethod.Post, "/cocktails") {
            addHeader("content-type", "application/json")
            addHeader("Accept", "application/json")
            setBody(Gson().toJson(createGinAndTonic))
        }

        val statusCode = call.response.status()!!

        verify { dao.createCocktail(any()) }
        assert(statusCode.value == 201)
    }

    @Test
    fun `GET should return cocktail and 200 OK`() = withTestApplication({
        mainWithDependencies(dao)
    }) {
        val call = handleRequest(HttpMethod.Get, "/cocktails/${margarita.id}")
        val statusCode = call.response.status()!!
        val responseType = object : TypeToken<CocktailDTO>() {}.type
        val content = Gson().fromJson<CocktailDTO>(call.response.content!!, responseType)

        verify { dao.getCocktail(margarita.id) }
        assert(statusCode.value == 200)
        assertEquals(margarita, content)
    }
}