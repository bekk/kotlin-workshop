package task11.ktor.task01.taskD

import io.ktor.locations.Location
import io.ktor.locations.put
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import task11.ktor.task01.setupApplication

// TODO - Create a fake database and populate it
// Hint: Use something simple to represent the DB - for example a mutable collection


@Location("/api")
class Root {

    @Location("/cocktails")
    class Cocktails
}

fun main() {
    embeddedServer(Netty, 8089) {
        setupApplication()

        routing {

            put<Root.Cocktails> {
                // TODO - Handle PUT requests and update your fake database
            }
        }
    }.start(wait = true)
}