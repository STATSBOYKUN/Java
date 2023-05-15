package chatbot.client.service;

import chatbot.client.model.Message;
import chatbot.client.model.User;

/**
 *
 * @author Mutaqin
 */
public abstract class ConnectionService {

    private Connection connection;
    private User user;

    public boolean connect() {
        if (connection == null) {
            connection = createConnection();
        }
        return connection.startConnection();
    }

    public boolean disconnect() {
        System.out.println("Disconnecting..");
        connection.request("close");
        System.out.println("Disconnected");
        return connection.closeConnection();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public abstract Connection createConnection();

    public abstract boolean login(String email, String password);

    public abstract boolean logout();

    public abstract Message sendMessage(Message message);

    public abstract boolean register(String name, String email, String password);

    public Connection getConnection() {
        return connection;
    }
}
