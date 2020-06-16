package task11.ktor

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import io.ktor.http.HttpMethod
import io.ktor.server.testing.handleRequest
import io.ktor.server.testing.setBody
import io.ktor.server.testing.withTestApplication
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import task11.ktor.task02.CocktailDAO
import task11.ktor.task02.mainWithDependencies
import kotlin.test.Test
import kotlin.test.assertEquals

class RoutesTest {
    val dao: CocktailDAO = mockk()
    val defaultMapper: ObjectMapper = jacksonObjectMapper()

    init {

        every { dao.getCocktails() } returns cocktails
        every { dao.getCocktail(margarita.id) } returns margarita
        every { dao.createCocktail(createGinAndTonic) } returns ginAndTonic
    }

    @Test
    fun `GET should return cocktails and 200 OK`() = withTestApplication({
        mainWithDependencies(dao)
    }) {
        val call = handleRequest(HttpMethod.Get, "/cocktails") {
            addHeader("Accept", "application/json")
        }
        val statusCode = call.response.status()!!
        val content = call.response.content!!

        verify { dao.getCocktails() }
        assert(statusCode.value == 200)
        assertEquals(cocktails, defaultMapper.readValue(content))
    }

    @Test
    fun `POST should persist cocktail and return 201 Created`() = withTestApplication({
        mainWithDependencies(dao)
    }) {
        val call = handleRequest(HttpMethod.Post, "/cocktails") {
            addHeader("content-type", "application/json")
            addHeader("Accept", "application/json")
            setBody(defaultMapper.writerWithDefaultPrettyPrinter().writeValueAsString(createGinAndTonic))
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
        val content = call.response.content!!

        verify { dao.getCocktail(margarita.id) }
        assert(statusCode.value == 200)
        assertEquals(margarita, defaultMapper.readValue(content))
    }
}