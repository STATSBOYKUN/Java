package chatbot;

import chatbot.server.ChatbotServer;
import chatbot.util.Setting;

/**
 *
 * @author Mutaqin
 */
public class Server {
    public static void main(String[] args) {
        int port = Setting.getDefault().getPort();
        ChatbotServer server = new ChatbotServer();
        System.out.println("Starting server on port "+port);
        server.start(port);
    }
}
