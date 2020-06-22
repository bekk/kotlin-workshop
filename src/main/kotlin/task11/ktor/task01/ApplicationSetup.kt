package task11.ktor.task01

import com.fasterxml.jackson.core.util.DefaultIndenter
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import io.ktor.application.Application
import io.ktor.application.ApplicationStarted
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.http.content.default
import io.ktor.http.content.files
import io.ktor.http.content.static
import io.ktor.http.content.staticRootFolder
import io.ktor.jackson.jackson
import io.ktor.locations.Locations
import io.ktor.routing.routing
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
