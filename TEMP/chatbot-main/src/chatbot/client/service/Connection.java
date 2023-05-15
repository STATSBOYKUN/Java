package chatbot.client.service;

import chatbot.server.model.User;

/**
 *
 * @author Mutaqin
 */
public interface Connection {
    public boolean startConnection();
    public boolean closeConnection();
    public String request(String params);
    public String response();
}
