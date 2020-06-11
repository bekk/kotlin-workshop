package task11.ktor


import io.ktor.application.call
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.route
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main() {
    embeddedServer(Netty, 8089) {
        routing {
            route("/test") {
                get("/get") {
                    call.respond("Imma here")
                }
            }
        }
    }.start(wait = true)
}