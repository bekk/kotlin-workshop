package task11.ktor.task02

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.intellij.lang.annotations.Language
import java.sql.Connection
import java.sql.ResultSet
import javax.sql.DataSource

val dataSource: DataSource = HikariDataSource(HikariConfig().apply {
    jdbcUrl = "jdbc:h2:mem:testdb;MODE=PostgreSQL;DB_CLOSE_DELAY=-1"
})

fun createDbTables(dataSource: DataSource) {
    @Language("H2")
    val sqlsetup: String = """
    CREATE TABLE cocktail(id VARCHAR(36) NOT NULL, name VARCHAR(100) NOT NULL);
    CREATE TABLE ingredient(id VARCHAR(36) NOT NULL, cocktail_id VARCHAR(36) NOT NULL, name VARCHAR(100) NOT NULL);
    """

    dataSource
        .transaction {
            prepareStatement(sqlsetup).execute()
        }
}

fun <T> DataSource.transaction(block: Connection.() -> T): T {
    var connection: Connection? = null
    try {
        connection = this.connection
        connection.autoCommit = false

        val result = connection.run(block)
        connection.commit()

        return result
    } catch (exception: Exception) {
        connection?.rollback()
        throw exception
    } finally {
        connection?.close()
    }
}

fun <T> ResultSet.map(block: ResultSet.() -> T): List<T> {
    val list = mutableListOf<T>()
    while (this.next()) {
        list.add(this.run(block))
    }
    return list
}
