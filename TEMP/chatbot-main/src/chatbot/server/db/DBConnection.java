package chatbot.server.db;

import chatbot.util.Setting;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mutaqin
 */
public class DBConnection {

    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            String url = "jdbc:sqlite:"+Setting.getDefault().getDbfile();
            System.out.println("URL:"+url);
            try {
                connection = DriverManager.getConnection(url);
            } catch (SQLException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connection;
    }
}
