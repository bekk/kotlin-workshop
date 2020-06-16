package task11.ktor.task02

import com.fasterxml.jackson.core.util.DefaultIndenter
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.jackson.jackson
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty


fun main() {
    embeddedServer(Netty, 8089, module = Application::main).start(wait = true)
}

fun Application.main() {
    prepopulateDatabase(dataSource)
    println(CocktailDAO(dataSource).getCocktails())

    val dao = CocktailDAO(dataSource)

    mainWithDependencies(dao)
}

fun Application.mainWithDependencies(dao: CocktailDAO) {
    install(io.ktor.locations.Locations)
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

    routing {
        cocktails(dao)
    }
}