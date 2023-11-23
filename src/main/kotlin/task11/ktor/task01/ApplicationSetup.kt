package task11.ktor.task01

import io.ktor.server.application.Application
import io.ktor.server.application.ApplicationStarted
import io.ktor.server.application.install
import io.ktor.server.routing.routing
import io.ktor.server.plugins.ContentNegotiation
import io.ktor.server.locations.Locations
import io.ktor.server.http.content.default
import io.ktor.server.http.content.files
import io.ktor.server.http.content.static
import io.ktor.server.http.content.staticRootFolder
import io.ktor.serialization.jackson.jackson
import com.fasterxml.jackson.core.util.DefaultIndenter
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import java.io.File

fun Application.setupApplication() {
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
    routing {
        static {
            staticRootFolder = File("src/main/kotlin/task11/ktor")
            files("resources/")
            default("resources/index.html")
        }
    }

    environment.monitor.subscribe(ApplicationStarted) {
        println("Server started at http://localhost:8089")
    }
}
