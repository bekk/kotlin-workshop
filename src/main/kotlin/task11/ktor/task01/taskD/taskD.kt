package task11.ktor.task01.taskD

import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Location
import io.ktor.locations.put
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import task11.ktor.task01.setupApplication

/**
 * For our fourth task we'll mimic a database and let the user store some data.
 *
 * TODO:
 *  Create a fake database and populate it
 *  Hint: Use something simple to represent the DB, we don't need to persist state between restarts so a
 *  mutable collection will work wonders.
 *
 *  Bonus: Add a GET endpoint to retrieve the stored cocktails
 */


@Location("/api")
class Root {

    @Location("/cocktails")
    class Cocktails
}

@KtorExperimentalLocationsAPI
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