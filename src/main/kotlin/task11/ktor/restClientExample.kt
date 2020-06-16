package task11.ktor

import io.ktor.application.call
import io.ktor.http.content.files
import io.ktor.http.content.static
import io.ktor.http.content.staticRootFolder
import io.ktor.request.receiveText
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.route
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import java.io.File

fun main() {
    prepopulateDatabase(dataSource)

    embeddedServer(Netty, 8089) {
        routing {
            static("static") {
                staticRootFolder = File("src/main/kotlin/task11/ktor")
                files("resources/")
            }
            route("/api") {
                get("/get") {
                    call.respond("Imma here")
                }
                post("/form") {
                    println("ok!")
                    println(call.receiveText())
                    call.respond("all good")
                }
            }
        }
    }.start(wait = true)
}
