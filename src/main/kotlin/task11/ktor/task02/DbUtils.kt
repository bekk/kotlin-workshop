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
    
    INSERT INTO cocktail VALUES ('9b59090e-9968-4e43-9675-859f6cc64fda', 'Margarita');
    INSERT INTO ingredient VALUES ('b2f0bdd0-8e54-45d7-896b-8f4f6f1aad3b', '9b59090e-9968-4e43-9675-859f6cc64fda', 'Tequila');
    INSERT INTO ingredient VALUES ('8cf30024-26a6-4988-8c4e-68939d27515a', '9b59090e-9968-4e43-9675-859f6cc64fda', 'Triple sec');
    INSERT INTO ingredient VALUES ('e871a63e-5fa1-42fb-8cdd-aa49ddbf0656', '9b59090e-9968-4e43-9675-859f6cc64fda', 'Lime juice');
    INSERT INTO ingredient VALUES ('9bde8bdd-c473-4f76-9499-0bede908ce05', '9b59090e-9968-4e43-9675-859f6cc64fda', 'Salt');
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
