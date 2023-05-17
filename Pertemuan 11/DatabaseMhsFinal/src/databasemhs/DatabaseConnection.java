package databasemhs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:1110/student";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "oilalala111003";
    private static final Logger LOGGER = Logger.getLogger(DatabaseConnection.class.getName());
    private static Connection connection;

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                LOGGER.log(Level.INFO, "Connecting to database...");
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                LOGGER.log(Level.INFO, "Database connection established.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            LOGGER.log(Level.SEVERE, "Error establishing database connection.", e);
        }
        return connection;
    }
}
