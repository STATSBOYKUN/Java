package chatbot.server;

import chatbot.util.Setting;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mutaqin
 */
public class ChatbotServer {

    private ServerSocket serverSocket;
    private List<ClientService> clients;

    public ChatbotServer() {
        clients =  new ArrayList<>();
    }
    
    public void start(){
        start(Setting.getDefault().getPort());
    }

    public void start(int port) {
        try {
            serverSocket = new ServerSocket(port);
            while (true) {
                SocketClient client = new SocketClient(serverSocket.accept());
                client.start();
                clients.add(client);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void stop() {
        try {
            serverSocket.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
