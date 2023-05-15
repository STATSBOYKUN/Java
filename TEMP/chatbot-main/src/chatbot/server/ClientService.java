package chatbot.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Mutaqin
 */
public abstract class ClientService extends Thread {

    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public ClientService(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    public void run() {
        try {
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            while (true) {
                String message = getRequest();
                if(message==null) 
                    return;
        
                if ("close".equals(message)) {
                    sendResponse("bye");
                    close();
                }
                if ("connect".equals(message)) {
                    sendResponse("connected");
                }
                handleRequest(message);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void close() {
        try {
            in.close();
            out.close();
            clientSocket.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void sendResponse(String message) {
        out.println(message);
    }

    public String getRequest() {
        try {
            return in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public abstract void handleRequest(String message);
}
